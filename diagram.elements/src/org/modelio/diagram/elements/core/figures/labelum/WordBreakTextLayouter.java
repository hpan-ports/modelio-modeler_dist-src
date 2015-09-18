/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.diagram.elements.core.figures.labelum;

import java.text.BreakIterator;
import java.util.Locale;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.TextUtilities;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.TextLayout;

/**
 * Possible UTF return symbols:
 * <li> ↵
 * <li> : &#59012 : \uE684
 * <li>⏎ : &#9166; : \u23CE
 */
@objid ("1a999e83-12b3-473b-8e7e-450327bd8cff")
public class WordBreakTextLayouter implements ILabelumTextLayouter {
    /**
     * The instance
     */
    @objid ("f2ec18f4-4ff4-45ce-a16b-cc5c34ab3430")
    public static final WordBreakTextLayouter INSTANCE = new WordBreakTextLayouter();

    @objid ("eea4b592-fa1d-465d-8811-0c421df16013")
    @Override
    public String getLineEndSymbol() {
        final String s = "\u23CE";
        return s;
    }

    @objid ("dd533569-faf0-44ff-957b-d2b416e75a33")
    @Override
    public String formatText(LabelumFigure labelumFigure, String origText, Dimension maxSize) {
        final TextUtilities textUtilities = labelumFigure.getTextUtilities();
        
        String lineBreakSymbol = getLineEndSymbol();
        int lineBreakWidth = textUtilities.getTextExtents(
                lineBreakSymbol, labelumFigure.getFont()).width;
        
        String truncSymbol = getTruncationString();
        int truncationWidth = textUtilities.getTextExtents(
                truncSymbol, labelumFigure.getFont()).width;
        
        
        final TextLayout textLayout = labelumFigure.getTextLayout();
        labelumFigure.setupTextLayout(textLayout, origText);
        final int allowedWidth = Math.max(maxSize.width - lineBreakWidth, truncationWidth);
        textLayout.setWidth(allowedWidth);
        
        StringBuilder sb = new StringBuilder();
        
        Rectangle lineBounds;
        int[] offsets = textLayout.getLineOffsets();
        for (int i=0; i< offsets.length-1; i++) {
            final boolean isNextLine = i < offsets.length-2;
            
            lineBounds = textLayout.getLineBounds(i);
        
            if (sb.length() > 0 && (isNextLine || lineBounds.width > lineBreakWidth)) {
                // Append line break unless it is the last line and last line size is
                // thinner than line break symbol
                sb.append(lineBreakSymbol);
                sb.append("\n");
            }
            
            sb.append(origText, offsets[i], offsets[i+1]);
            
            if ( isNextLine) {
                // There is a next line
                Rectangle nextLineBounds = textLayout.getLineBounds(i+1) ;
                int lineBottom = nextLineBounds.y + nextLineBounds.height;
                if (maxSize.height > -1 && lineBottom > maxSize.height) {
                    // no vertical space left : 
                    // put truncation string at the end of last displayed line and stop
                    
                    String lastLine = origText.substring(offsets[i], offsets[i+1]);
                    int len = textUtilities.getLargestSubstringConfinedTo(
                            lastLine, labelumFigure.getFont(), maxSize.width - truncationWidth);
                    sb.replace(offsets[i] + len, sb.length(), truncSymbol);
                    
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }

    @objid ("099cb498-bfb9-455f-8564-0ccf4220af88")
    @SuppressWarnings("unused")
    @Deprecated
    private String oldformatText(LabelumFigure labelumFigure, String origText, Dimension maxSize) {
        final TextUtilities textUtilities = labelumFigure.getTextUtilities();
        
        final Font font = labelumFigure.getFont();
        int truncationWidth = textUtilities.getTextExtents(
                getTruncationString(), font).width;
        
        if (maxSize.width < truncationWidth)
            maxSize.width = truncationWidth;
        
        String remainingText = origText;
        
        String lineBreakSymbol = getLineEndSymbol();
        int lineBreakWidth = textUtilities.getTextExtents(
                lineBreakSymbol, font).width;
        
        StringBuilder sb = new StringBuilder();
        int remainingHeight = maxSize.height;
        boolean finished = false;
        do {
            // 1) get largest string
            int largestLineLength = textUtilities.getLargestSubstringConfinedTo(
                    remainingText, font, maxSize.width - lineBreakWidth);
        
            if (largestLineLength < remainingText.length()) {
                // 2) find last location where line can be break 
                Range breakRange = findBreak(remainingText, largestLineLength);
        
                // Compute line and its dimensions
                final String textLine = remainingText.substring(0, breakRange.start +1 );
                final int lineHeight = textUtilities.getTextExtents(textLine, font).height;
        
                if (remainingHeight < lineHeight && sb.length() > 0) {
                    // no vertical space left : 
                    // put truncation string at the end of last displayed line
                    final int lastLineStart = sb.lastIndexOf("\n", sb.length() - 2)+1;
                    String lastLine = sb.substring(lastLineStart);
                    int len = textUtilities.getLargestSubstringConfinedTo(
                            lastLine, font, maxSize.width - truncationWidth);
                    sb.replace(lastLineStart + len, sb.length(), getTruncationString());
        
                    finished = true;
                } else {
                    // 3) break line and loop until nothing more
                    sb.append(textLine);
                    sb.append(lineBreakSymbol);
                    sb.append("\n");
                    remainingText = remainingText.substring(breakRange.end);
        
                    remainingHeight -= lineHeight;
                }
            } else {
                finished = true;
            }
        } while(! finished) ;
        return sb.toString();
    }

    @objid ("4876ba90-90d2-452b-9877-5633dc7d7671")
    private String getTruncationString() {
        return "...";
    }

    /**
     * Find a return the line break range.
     * The returned range will be replaced by a line return.
     * @param text the text to search
     * @param beforeIndex the offset to start back from
     * @return the text range to replace by a line break
     */
    @objid ("36559f26-261b-41bb-9fa4-39bf518dad44")
    @Deprecated
    private Range findBreak(String text, int beforeIndex) {
        BreakIterator wb = BreakIterator.getLineInstance(Locale.getDefault());
        Range ret = new Range();
        
        wb.setText(text);
        ret.end = wb.preceding(beforeIndex);
        
        if (ret.end == BreakIterator.DONE) {
            ret.end = beforeIndex;
            ret.start = beforeIndex;
        } else {
            ret.start = ret.end - 1;
            while (Character.isWhitespace(text.charAt(ret.start))) 
                ret.start--;
        }
        return ret;
    }

    @objid ("8664697c-b0ea-402a-bf86-02c69c566a94")
    @Deprecated
    private static class Range {
        @objid ("d299f128-9f7d-4061-992c-6a30acf62f7e")
        public int start;

        @objid ("942bf548-8dae-43f2-908f-def65a53bfa1")
        public int end;

        @objid ("fc4a04fa-d26d-4352-94f8-1e6ab10fe0b6")
        public Range() {
            // TODO Auto-generated constructor stub
        }

    }

}

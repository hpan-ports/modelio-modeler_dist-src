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
                                    

package org.modelio.diagram.elements.core.figures.html.fromswing;

import java.util.NoSuchElementException;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;
import javax.swing.text.StyleConstants;
import javax.swing.text.View;
import javax.swing.text.html.CSS;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.ListView;
import javax.swing.text.html.StyleSheet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.text.BlockFlow;
import org.eclipse.draw2d.text.FlowAdapter;
import org.eclipse.draw2d.text.FlowFigure;
import org.modelio.diagram.elements.common.header.HeaderTextFlow;
import org.modelio.diagram.elements.common.header.WrappedHeaderFigure.MarginFlowBorder;

@objid ("114f52af-b848-4b95-8cef-133c022e2ee2")
class ListFigureFromViewFactory extends DefaultFigureFromViewFactory {
    @objid ("f9a4e4ff-9e3a-4836-89c5-71467d9ac992")
    private boolean isLeftToRight = true;

// Lists.
    /**
     * 
     * From javax.swing.text.html.CSS.Value
     * // Lists.
     * static final Value DISC = new Value("disc");
     * static final Value CIRCLE = new Value("circle");
     * static final Value SQUARE = new Value("square");
     * static final Value DECIMAL = new Value("decimal");
     * static final Value LOWER_ROMAN = new Value("lower-roman");
     * static final Value UPPER_ROMAN = new Value("upper-roman");
     * static final Value LOWER_ALPHA = new Value("lower-alpha");
     * static final Value UPPER_ALPHA = new Value("upper-alpha");
     */
    @objid ("8ae8812c-ab7b-43ef-8e7b-32112444514b")
     static final String sDISC = ("disc");

    @objid ("0be5ea3c-58e5-4b35-b4c4-b64f82181570")
     static final String sCIRCLE = ("circle");

    @objid ("9e48c5d6-c8b4-44dc-8aba-641c38be7e4b")
     static final String sSQUARE = ("square");

    @objid ("53effc1d-5826-437c-9a9e-850bdf5a5c07")
     static final String sDECIMAL = ("decimal");

    @objid ("6bd9ab56-9993-4862-b35c-f9edefd35b07")
     static final String sLOWER_ROMAN = ("lower-roman");

    @objid ("48be007d-0608-49a1-a54d-9b4e0b7592e3")
     static final String sUPPER_ROMAN = ("upper-roman");

    @objid ("b0cb2691-bad9-4472-ae76-e2fd674835f0")
     static final String sLOWER_ALPHA = ("lower-alpha");

    @objid ("520f56a2-c27a-44b3-8010-405b4060442d")
     static final String sUPPER_ALPHA = ("upper-alpha");

/* list of roman numerals */
    @objid ("80c8f404-f118-4eb0-a398-76927be2bd1c")
     static final char[][] romanChars = {
        {'i', 'v'},
        {'x', 'l' },
        {'c', 'd' },
        {'m', '?' },
    };

    @objid ("051f1070-3e08-4458-ba2f-94096a5d127c")
    private IFigureFromViewFactory parent;

    @objid ("fab0c3fd-d415-499f-b9b5-38c3a6f93e2c")
    public ListFigureFromViewFactory(IFigureFromViewFactory parent) {
        super(parent.getFont());
        this.parent = parent;
    }

    @objid ("9192ce55-f748-4de7-b23d-b51bef7581aa")
    @Override
    public Figure createFigure(View child, Figure parentFigure) {
        if (child.getParent() instanceof ListView)
            return createItem(parentFigure, child);
        else
            return this.parent.createFigure(child, parentFigure);
    }

    @objid ("188ba23e-f955-49b0-8546-8ba2d6fe95c9")
    @Override
    public IFigureFromViewFactory getFactory(View child, Figure parentFigure) {
        return this.parent.getFactory(child, parentFigure);
    }

    /**
     * Returns a string that represents the value
     * of the HTML.Attribute.TYPE attribute.
     * If this attributes is not defined, then
     * then the type defaults to "disc" unless
     * the tag is on Ordered list.  In the case
     * of the latter, the default type is "decimal".
     */
    @objid ("cb687ac4-6cab-4891-8f2e-29c9c42ad122")
    private ListItemType getListItemType(View listItemView) {
        StyleSheet style = ((HTMLDocument) listItemView.getDocument()).getStyleSheet();
        AttributeSet atts = style.getViewAttributes(listItemView);
        
        ListItemType childtype = ListItemType.fromCssVal(atts.getAttribute(CSS.Attribute.LIST_STYLE_TYPE));
        
        if (childtype == null) {
            // Parent view.
            if (getTag(listItemView.getElement().getParentElement()) == HTML.Tag.OL) {
                childtype = ListItemType.DECIMAL;
            } else {
                childtype = ListItemType.DISC;
            }
        }
        return childtype;
    }

    @objid ("26930b17-1b8f-4849-ac2c-13c51e480507")
    public Figure createItem(Figure currentFig, View view) {
        Figure g = currentFig;
        
        ListItemType childtype = getListItemType(view);
        Element elem = view.getElement();
        
        Element parentItem = elem.getParentElement();
        int idx = getIndexInParent(parentItem, elem);
        
        
        FlowFigure flow = new BlockFlow();
        FlowFigure bullet = null;
        
        if (childtype == ListItemType.SQUARE || childtype == ListItemType.CIRCLE
                || childtype == ListItemType.DISC) {
            bullet = createShape(currentFig, childtype);
        } else if (childtype == ListItemType.DECIMAL) {
            bullet = createLetter(g, '1', getRenderIndex(parentItem, idx));
        } else if (childtype == ListItemType.LOWER_ALPHA) {
            bullet = createLetter(g, 'a', getRenderIndex(parentItem, idx));
        } else if (childtype == ListItemType.UPPER_ALPHA) {
            bullet = createLetter(g, 'A',  getRenderIndex(parentItem, idx));
        } else if (childtype == ListItemType.LOWER_ROMAN) {
            bullet = createLetter(g, 'i',  getRenderIndex(parentItem, idx));
        } else if (childtype == ListItemType.UPPER_ROMAN) {
            bullet = createLetter(g, 'I',  getRenderIndex(parentItem, idx));
        }
        
        if (bullet != null) {
            MarginFlowBorder margin = new MarginFlowBorder(new Insets(0, 0, 0, 4));
            bullet.setBorder(margin);
            flow.add(bullet);
            initStyle(bullet, view);
        }
        initStyle(flow, view);
        return flow;
    }

    @objid ("111bcded-b4cf-4ec9-a072-e410dc621b8b")
    private int getIndexInParent(Element parentItem, Element elem) {
        for (int i=0; i< parentItem.getElementCount(); ++i) {
            if (parentItem.getElement(i) == elem)
                return i;
        }
        
        throw new NoSuchElementException(elem+" not found in "+parentItem);
    }

    /**
     * Returns an integer that should be used to render the child at
     * <code>childIndex</code> with. The retValue will usually be
     * <code>childIndex</code> + 1, unless <code>parentView</code>
     * has some Views that do not represent LI's, or one of the views
     * has a HTML.Attribute.START specified.
     */
    @objid ("dafc36ca-79a6-4e82-946b-6ac4063f922f")
    private int getRenderIndex(Element parentView, int childIndex) {
        int retIndex = childIndex;
        for (int counter = childIndex; counter >= 0; counter--) {
            AttributeSet as = parentView.getElement(counter).
                              getAttributes();
            if (as.getAttribute(StyleConstants.NameAttribute) !=
                HTML.Tag.LI) {
                retIndex--;
            } else if (as.isDefined(HTML.Attribute.VALUE)) {
                Object value = as.getAttribute(HTML.Attribute.VALUE);
                if (value != null &&
                    (value instanceof String)) {
                    try {
                        int iValue = Integer.parseInt((String)value);
                        return retIndex - counter + iValue;
                    }
                    catch (NumberFormatException nfe) {/* ignore */}
                }
            }
        }
        return retIndex;
    }

    /**
     * Draws the graphical bullet item specified by the type argument.
     * @param g the graphics context
     * @param type type of bullet to draw (circle, square, disc)
     */
    @objid ("c27348f6-8c63-40e2-a2a4-b350c6b6f8ac")
    FlowAdapter createShape(Figure g, ListItemType type) {
        FlowAdapter adapterFig = new FlowAdapter();
        
        if (type == ListItemType.SQUARE) {
            RectangleFigure f = new RectangleFigure();
            f.setPreferredSize(8, 8);
            adapterFig.add(f);
        } else if (type == ListItemType.CIRCLE) {
            Ellipse f = new Ellipse();
            f.setOpaque(false);
            f.setPreferredSize(8, 8);
            adapterFig.add(f);
            //g.drawOval(x, y, 8, 8);
        } else {
            Ellipse f = new Ellipse();
            f.setOpaque(true);
            final Dimension d = new Dimension(6, 6);
            f.setPreferredSize(d);
            f.setMinimumSize(d);
            adapterFig.add(f);
        }
        
        LayoutManager man = new ToolbarLayout(true);
        adapterFig.setLayoutManager(man);
        return adapterFig;
    }

    /**
     * Draws the letter or number for an ordered list.
     * @param parentFig the graphics context
     * @param letter type of ordered list to draw
     * @param index position of the list item in the list
     */
    @objid ("01789a53-8969-46bf-ba90-9d2fc8d78c1d")
    FlowFigure createLetter(Figure parentFig, char letter, int index) {
        String str = formatItemNum(index, letter);
        str = this.isLeftToRight ? str + "." : "." + str;
        
        HeaderTextFlow f = new HeaderTextFlow();
        f.setText(str);
        return f;
    }

    /**
     * Converts the item number into the ordered list number
     * (i.e.  1 2 3, i ii iii, a b c, etc.
     * @param itemNum number to format
     * @param type type of ordered list
     */
    @objid ("41cd5e15-99b3-4825-a31c-f6d0ed0f109c")
    private String formatItemNum(int itemNum, char type) {
        //String numStyle = "1";
        
        boolean uppercase = false;
        
        String formattedNum;
        
        switch (type) {
        case '1':
        default:
            formattedNum = String.valueOf(itemNum);
            break;
        
        case 'A':
            uppercase = true;
            //$FALL-THROUGH$
        case 'a':
            formattedNum = formatAlphaNumerals(itemNum);
            break;
        
        case 'I':
            uppercase = true;
            //$FALL-THROUGH$
        case 'i':
            formattedNum = formatRomanNumerals(itemNum);
        }
        
        if (uppercase) {
            formattedNum = formattedNum.toUpperCase();
        }
        return formattedNum;
    }

    /**
     * Converts the item number into an alphabetic character
     * @param itemNum number to format
     */
    @objid ("ffc5697a-840e-4ff2-94c6-78246afc2fb0")
    String formatAlphaNumerals(int itemNum) {
        String result;
        
        if (itemNum > 26) {
            result = formatAlphaNumerals(itemNum / 26) +
                formatAlphaNumerals(itemNum % 26);
        } else {
            // -1 because item is 1 based.
            result = String.valueOf((char)('a' + itemNum - 1));
        }
        return result;
    }

    /**
     * Converts the item number into a roman numeral
     * @param num number to format
     */
    @objid ("db4a8e93-e450-4c8e-8f5e-2ecdf0294622")
    String formatRomanNumerals(int num) {
        return formatRomanNumerals(0, num);
    }

    /**
     * Converts the item number into a roman numeral
     * @param num number to format
     */
    @objid ("fa56a566-e50a-48fc-ad48-86907f947fc8")
    String formatRomanNumerals(int level, int num) {
        if (num < 10) {
            return formatRomanDigit(level, num);
        } else {
            return formatRomanNumerals(level + 1, num / 10) +
                formatRomanDigit(level, num % 10);
        }
    }

    /**
     * Converts the item number into a roman numeral
     * @param level position
     * @param aDigit digit to format
     */
    @objid ("9f74db55-b948-4180-b395-5df6acb0b4bc")
    String formatRomanDigit(int level, int aDigit) {
        int digit = aDigit;
        String result = "";
        if (digit == 9) {
            result = result + romanChars[level][0];
            result = result + romanChars[level + 1][0];
            return result;
        } else if (digit == 4) {
            result = result + romanChars[level][0];
            result = result + romanChars[level][1];
            return result;
        } else if (digit >= 5) {
            result = result + romanChars[level][1];
            digit -= 5;
        }
        
        for (int i = 0; i < digit; i++) {
            result = result + romanChars[level][0];
        }
        return result;
    }

    /**
     * Translation of constants from package private javax.swing.text.html.CSS.Value .
     * @author cmarin
     * @see javax.swing.text.html.CSS.Value
     */
    @objid ("2c892fda-e509-4838-801f-c7ecf76e25b4")
    @SuppressWarnings("javadoc")
    private enum ListItemType {
        DECIMAL,
        DISC,
        LOWER_ALPHA,
        UPPER_ALPHA,
        LOWER_ROMAN,
        UPPER_ROMAN,
        SQUARE,
        CIRCLE;

        @objid ("d1ee49ee-bf47-4adf-a74b-69a8a007be8d")
        public static ListItemType fromCssVal(Object cssVal) {
            if (cssVal == null)
                return null;
            
            switch (cssVal.toString()) {
            case sDISC: return DISC;
            case sCIRCLE : return CIRCLE;
            case sSQUARE : return SQUARE;
            case sDECIMAL : return DECIMAL;
            case sLOWER_ROMAN : return LOWER_ROMAN;
            case sUPPER_ROMAN : return UPPER_ROMAN;
            case sLOWER_ALPHA : return LOWER_ALPHA;
            case sUPPER_ALPHA : return UPPER_ALPHA;
            default:
                throw new IllegalArgumentException(cssVal.toString());
            
            }
        }

    }

}

/* 
 * Copyright 2013-2015 Modeliosoft - www.modeliosoft.com 
 * 
 * All information contained herein is, and remains the property of Modeliosoft.
 * The intellectual and technical concepts contained herein are proprietary 
 * to Modeliosoft and may be covered by French and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Modeliosoft.
 * 
 */


package org.modelio.patterns.exporter.impl;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.IDiagramLink;
import org.modelio.api.diagram.IDiagramNode;
import org.modelio.api.diagram.ILinkPath;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.patterns.plugin.Patterns;

@objid ("1b653dfa-6954-493a-94d6-1b3531714bb3")
class DiagramGenerator {
    @objid ("8f2a5d8d-73da-4687-92e5-fbd71c2b941e")
    private List<AbstractDiagram> diagrams = new ArrayList<>();

    @objid ("4d932b04-8e1b-4579-bd5b-dda0c9cdd231")
    public void addDiagram(AbstractDiagram diagram) {
        this.diagrams.add(diagram);
    }

    @objid ("8fd75268-5320-4075-90cf-0c0c0baeac37")
    public void generate(final FileWriterUtil filewriter) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                for (AbstractDiagram diagram : DiagramGenerator.this.diagrams) {
                    generateIDiagramGraphic(filewriter, diagram);
                }
            }
        });
    }

    @objid ("db2638ec-4cf7-40ed-93cc-30e68e4cbdc1")
    private void generateIDiagramGraphic(FileWriterUtil filewriter, AbstractDiagram diagram) {
        try (IDiagramHandle rep = Modelio.getInstance().getDiagramService().getDiagramHandle(diagram)) {
            filewriter.write("rep = Modelio.getInstance().getDiagramService().getDiagramHandle("
                    + "(AbstractDiagram) elements.get(" + IdGenerator.getInstance().getId(diagram) + "));");
        
            filewriter.write("rep.getDiagramNode().setStyle(getIStyleHandleByName(\"" + rep.getDiagramNode().getStyle().getName()
                    + "\"));");
        
            for (IDiagramNode graphic : rep.getDiagramNode().getNodes()) {
                generateGraphicNode(filewriter, graphic);
            }
            for (IDiagramLink graphic : rep.getDiagramNode().getLinks()) {
                generateGraphicLink(filewriter, graphic);
            }
        
            filewriter.write("rep.save();");
            filewriter.write("rep.close();");
        
            rep.close();
        }
    }

    @objid ("fd579edc-3662-4241-b756-0fb27772d18c")
    private void generateGraphicNode(FileWriterUtil filewriter, IDiagramNode graphic) {
        String nodeId = IdGenerator.getInstance().computeNextId();
        if (graphic.getElement() != null) {
            filewriter.write("try{");
            if (IdGenerator.getInstance().exists(graphic.getElement())) {
        
                String id = "elements.get(" + IdGenerator.getInstance().getId(graphic.getElement()) + ")";
        
                filewriter.write("rep.unmask(" + id + ", " + graphic.getBounds().x + "," + graphic.getBounds().y + ");");
        
                filewriter.write("links = rep.getDiagramGraphics(" + id + ");");
                filewriter.write("IDiagramNode " + nodeId + " = (IDiagramNode) links.get(0);");
                filewriter.write("rec = new Rectangle(" + graphic.getBounds().x + "," + graphic.getBounds().y + ","
                        + graphic.getBounds().width + "," + graphic.getBounds().height + ");");
                filewriter.write(nodeId + ".setBounds(rec);");
            } else if (graphic.getElement().getStatus().isRamc()) {
                filewriter.write("rep.unmask(session.findElementById(Metamodel.getJavaInterface(Metamodel.getMClass(\""
                        + graphic.getElement().getMClass().getName() + "\")),\"" + graphic.getElement().getUuid().toString()
                        + "\")," + graphic.getBounds().x + "," + graphic.getBounds().y + ");");
                filewriter
                        .write("links = rep.getDiagramGraphics(session.findElementById(Metamodel.getJavaInterface(Metamodel.getMClass(\""
                                + graphic.getElement().getMClass().getName()
                                + "\")),\""
                                + graphic.getElement().getUuid().toString() + "\"));");
                filewriter.write("IDiagramNode " + nodeId + " = (IDiagramNode) links.get(0);");
                filewriter.write("rec = new Rectangle(" + graphic.getBounds().x + "," + graphic.getBounds().y + ","
                        + graphic.getBounds().width + "," + graphic.getBounds().height + ");");
                filewriter.write(nodeId + ".setBounds(rec);");
            } else {
                String name = ((ModelElement) graphic.getElement()).getName();
                filewriter.write("rep.unmask((MObject) parameters.get(\"" + name + "\")," + graphic.getBounds().x + ","
                        + graphic.getBounds().y + ");");
                filewriter.write("links = rep.getDiagramGraphics((MObject) parameters.get(\"" + name + "\"));");
                filewriter.write("IDiagramNode " + nodeId + " = (IDiagramNode) links.get(0);");
                filewriter.write("rec = new Rectangle(" + graphic.getBounds().x + "," + graphic.getBounds().y + ","
                        + graphic.getBounds().width + "," + graphic.getBounds().height + ");");
                filewriter.write(nodeId + ".setBounds(rec);");
            }
        
            for (String property : graphic.getLocalPropertyNames()) {
                String value = graphic.getProperty(property);
                filewriter.write(nodeId + ".setProperty(\"" + property + "\",\"" + value + "\");");
            }
            filewriter.write("}catch (Exception e) {   Patterns.LOG.debug(e); }");
            filewriter.countWrite("");
        
            for (IDiagramNode child : graphic.getNodes()) {
                generateGraphicNode(filewriter, child);
            }
        
            for (IDiagramLink child : graphic.getFromLinks()) {
                generateGraphicLink(filewriter, child);
            }
        
            for (IDiagramLink child : graphic.getToLinks()) {
                generateGraphicLink(filewriter, child);
            }
        }
    }

    @objid ("fd999cd2-08b1-43ba-956f-aa4ab1cf0ae2")
    private void generateGraphicLink(FileWriterUtil filewriter, IDiagramLink graphic) {
        if (IdGenerator.getInstance().exists(graphic.getElement())) {
            filewriter.write("try{");
            String id = "elements.get(" + IdGenerator.getInstance().getId(graphic.getElement()) + ")";
            String nodeId = IdGenerator.getInstance().computeNextId();
        
            filewriter.write("links = rep.unmask(" + id + ", 0, 0);");
            filewriter.write("links = rep.getDiagramGraphics(" + id + ");");
            filewriter.write("if(links.size() >0 && links.get(0) instanceof IDiagramLink){");
            filewriter.write("IDiagramLink " + nodeId + " = (IDiagramLink)links.get(0);");
        
            for (String property : graphic.getLocalPropertyNames()) {
                String value = graphic.getProperty(property);
                filewriter.write(nodeId + ".setProperty(\"" + property + "\",\"" + value + "\");");
                try {
                    filewriter.write(nodeId + ".setStyle(" + graphic.getStyle() + ");");
                } catch (Exception e) {
                    // Ignore error
                }
            }
        
            filewriter.write("points = new ArrayList<>();");
        
            try {
                ILinkPath path = graphic.getPath();
                if (path != null) {
        
                    for (Point point : path.getPoints()) {
                        filewriter.write("point = new Point(" + point.x + "," + point.y + ");");
                        filewriter.write("points.add(point);");
                    }
                    filewriter.write("try{");
                    filewriter.write(nodeId + ".setPath(points);");
                    filewriter.write("} catch (Exception e) {");
                    filewriter.write("calculate(" + nodeId + ");");
                    filewriter.write("}");
                }
        
            } catch (Exception e) {
                Patterns.LOG.debug(e);
            }
            filewriter.write("}");
            filewriter.write("}catch (Exception e) {   Patterns.LOG.debug(e); }");
            filewriter.countWrite("");
        }
    }

}

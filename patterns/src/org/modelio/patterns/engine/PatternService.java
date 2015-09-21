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


package org.modelio.patterns.engine;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import javax.inject.Inject;
import javax.xml.bind.JAXBException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.gproject.gproject.GProject;
import org.modelio.patterns.api.IPatternService;
import org.modelio.patterns.exporter.impl.PatternExporter;
import org.modelio.patterns.model.RuntimePattern;

@objid ("87ab8792-a942-47f7-b913-6c8668378fe6")
@Creatable
class PatternService implements IPatternService {
    @objid ("53c5fd73-0f43-4ae8-b694-921d1f320c01")
    private PatternRepository projectCatalog;

    @objid ("5b29ef74-86b6-4b89-a8a1-d1c1587093d7")
    @Override
    public void exportPattern(RuntimePattern pattern) throws IOException, JAXBException {
        // Export pattern
        new PatternExporter().exportPattern(pattern);
    }

    @objid ("3747c0ad-6674-46c9-9de8-cf72f9d4ff68")
    @Override
    public PatternRepository getCatalog() {
        return this.projectCatalog;
    }

    /**
     * Called by injection when the current project is closed, to dereference its pattern catalog.
     * @param project the current project.
     */
    @objid ("cd77fe80-0796-44ac-bea1-9c0708119dc0")
    @Inject
    @Optional
    public void onProjectClosed(@EventTopic(ModelioEventTopics.PROJECT_CLOSED) final GProject project) {
        if (project != null) {
            this.projectCatalog = null;
        }
    }

    /**
     * Called by injection when a project is opened, to load its pattern catalog.
     * @param project the current project.
     */
    @objid ("5a58cde4-dd24-495b-ad96-c7457c85970a")
    @Inject
    @Optional
    public void onProjectOpened(@EventTopic(ModelioEventTopics.PROJECT_OPENED) final GProject project) {
        if (project != null) {
            this.projectCatalog = new PatternRepository(project.getName(), project.getProjectDataPath().resolve("patterns"), false);
        }
    }

    @objid ("e845c1c2-adf6-429c-ae8a-f348016485f7")
    private static class CopyDirVisitor extends SimpleFileVisitor<Path> {
        @objid ("5164ef20-caab-45b2-a21a-0816b6b951ad")
        private StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;

        @objid ("b121e89a-9180-4824-85b4-f460b65cb113")
        private Path fromPath;

        @objid ("af00e411-3130-444c-a233-0771d08a7cf8")
        private Path toPath;

        @objid ("a9f4c731-394f-478c-a7cf-e871552046bf")
        public CopyDirVisitor(Path fromPath, Path toPath, StandardCopyOption copyOption) {
            this.fromPath = fromPath;
            this.toPath = toPath;
            this.copyOption = copyOption;
        }

        @objid ("178fe4a7-dcd5-4ba0-bd93-9a3e933ffebf")
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Path targetPath = this.toPath.resolve(this.fromPath.relativize(dir));
            
            if (!Files.exists(targetPath)) {
            
                Files.createDirectory(targetPath);
            
            }
            return FileVisitResult.CONTINUE;
        }

        @objid ("c51cc6ed-78f4-49c8-be51-ddbc8d348a84")
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.copy(file, this.toPath.resolve(this.fromPath.relativize(file)), this.copyOption);
            return FileVisitResult.CONTINUE;
        }

    }

}

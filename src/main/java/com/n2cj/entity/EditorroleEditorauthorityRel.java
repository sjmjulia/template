package com.n2cj.entity;

// Generated 2015-9-6 10:20:22 by Hibernate Tools 4.3.1

/**
 * EditorroleEditorauthorityRel generated by hbm2java
 */
public class EditorroleEditorauthorityRel implements java.io.Serializable {

    private EditorroleEditorauthorityRelId id;
    private EditorAuthority editorAuthority;
    private EditorRole editorRole;

    public EditorroleEditorauthorityRel() {
    }

    public EditorroleEditorauthorityRel(EditorroleEditorauthorityRelId id,
                                        EditorAuthority editorAuthority, EditorRole editorRole) {
        this.id = id;
        this.editorAuthority = editorAuthority;
        this.editorRole = editorRole;
    }

    public EditorroleEditorauthorityRelId getId() {
        return this.id;
    }

    public void setId(EditorroleEditorauthorityRelId id) {
        this.id = id;
    }

    public EditorAuthority getEditorAuthority() {
        return this.editorAuthority;
    }

    public void setEditorAuthority(EditorAuthority editorAuthority) {
        this.editorAuthority = editorAuthority;
    }

    public EditorRole getEditorRole() {
        return this.editorRole;
    }

    public void setEditorRole(EditorRole editorRole) {
        this.editorRole = editorRole;
    }

}

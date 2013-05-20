/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


public class Attachment {
    
    private Integer idAttachment;
    
    private String paths;
    
    private int idTask;

    public Attachment() {
    }

    public Attachment(Integer idAttachment) {
        this.idAttachment = idAttachment;
    }

    public Attachment(Integer idAttachment, String paths, int idTask) {
        this.idAttachment = idAttachment;
        this.paths = paths;
        this.idTask = idTask;
    }

    public Integer getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(Integer idAttachment) {
        this.idAttachment = idAttachment;
    }

    public String getPath() {
        return paths;
    }

    public void setPath(String path) {
        this.paths = path;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    
}

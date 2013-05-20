/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


public class Comment  {
    
    private Integer idComment;
    
    private int idUser;
    
    private String times;
    
    private String content;
    
    private int idTask;

    public Comment() {
    }

    public Comment(Integer idComment) {
        this.idComment = idComment;
    }

    public Comment(Integer idComment, int idUser, String times, String content, int idTask) {
        this.idComment = idComment;
        this.idUser = idUser;
        this.times = times;
        this.content = content;
        this.idTask = idTask;
    }

    public Integer getIdComment() {
        return idComment;
    }

    public void setIdComment(Integer idComment) {
        this.idComment = idComment;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

}

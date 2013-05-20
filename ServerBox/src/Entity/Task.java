/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;




public class Task {
    private int idTask;
    private int idCategory;
    private int idUser;
    private String title;
    private String deadline;
    private String tags;
    private String status;
    private String description;
    public Task() {
    }

    public Task(int idTask) {
        this.idTask = idTask;
    }

    public Task(int idTask, int idUser, String title, String deadline, String description, String tags, String status, int idCategory) {
        this.idTask = idTask;
        this.idUser = idUser;
        this.title = title;
        this.deadline = deadline;
        this.description = description;
        this.tags = tags;
        this.status = status;
        this.idCategory = idCategory;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

   
    
}

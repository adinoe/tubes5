/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Agungdlgs
 */
public class AssigneeTask {
    
    private int id_task;
    private int id_user;
    

    public Integer getIdUser() {
        return id_user;
    }
    public AssigneeTask(int id_task, int id_user)
    {
        this.id_task = id_task;
        this.id_user = id_user;
    }
    

    public void setIdUser(Integer id_user) {
        this.id_user = id_user;
    }
    
    public Integer getIdTask() {
        return id_task;
    }
    

    public void setIdTask(Integer id_task) {
        this.id_task = id_task;
    }
}

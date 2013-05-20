/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Agungdlgs
 */
public class AssigneeCtgr {
    
    private int idCategory;
    private int idUser;
    
    public AssigneeCtgr()
    {
    
    }
    
    public AssigneeCtgr(int id_c,int id_u)
    {
        this.idCategory = id_c;
        this.idUser = id_u;
    }
    
    

    public Integer getIdUser() {
        return idUser;
    }
    

    public void setIdUser(Integer id_user) {
        this.idUser = id_user;
    }
    
    public Integer getIdCategory() {
        return idCategory;
    }
    

    public void setIdCategory(Integer id_category) {
        this.idCategory = id_category;
    }
}

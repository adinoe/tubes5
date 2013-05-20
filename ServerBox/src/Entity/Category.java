/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Agungdlgs
 */

public class Category {
    
    private int idUser;
    private String title;
    private int idCategory;

    public Category() {
    }

    public Category(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Category(Integer idCategory, String title, int idUser) {
        this.idCategory = idCategory;
        this.title = title;
        this.idUser = idUser;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }    
}

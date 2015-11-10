/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockable;

/**
 *
 * @author Spencer Cheng
 */
public interface Lockable {    
    public void setKey(int key);
    public void lock(int key);
    public void unlock(int key);
    public boolean locked();
}

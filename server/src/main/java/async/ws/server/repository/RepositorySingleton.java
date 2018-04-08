/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package async.ws.server.repository;

/**
 *
 * @author juan
 */
public class RepositorySingleton {

    private static Repository repo;

    public static Repository getInstance() {
        if (repo == null) {
            return repo = new Repository();
        } else {
            return repo;
        }
    }
}

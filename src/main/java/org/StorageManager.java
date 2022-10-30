package org;

public class StorageManager {

    private static Storage storage;


    public static void registerStorage(Storage str){
        storage = str;
    }


    public static Storage getStorage(String path){

        storage.setPath(path);
        return storage;
    }

}

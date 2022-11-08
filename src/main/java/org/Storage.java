package org;

import java.util.List;

public abstract class Storage {

    public String path;

    public abstract boolean initStorage(String name, String path);

    public abstract void createNewFile(String name, String destinationPath);

    public void createFromTo(int n, int m, String name, String path, String extension){
        for(int i = n ; i <= m ; i++){

            if(extension != null)
                createNewFile(name.concat(String.valueOf(i)).concat(extension), path);
            else
                createNewFile(name.concat(String.valueOf(i)), path);
        }
    }

    public abstract void moveFile(String sourcePath, String destinationPath);

    public void moveFiles(List<String> paths, String destinationPath){

        for(String path : paths){

            moveFile(path, destinationPath);
        }
    }

    public abstract void copyFile(String sourcePath, String destinationPath);

    public void copyFiles(List<String> paths, String destinationPath){

        for(String path : paths){

            copyFile(path, destinationPath);
        }
    }

    public abstract void downloadFile(String sourcePath);


    public void downloadFiles(List<String> paths){

        for(String path : paths){

            downloadFile(path);
        }
    }

    public abstract void deleteFile(String sourcePath);

    public void deleteFiles(List<String> paths){

        for(String path : paths){

            deleteFile(path);
        }
    }

    //NOVA - IMPL U TEST
    public abstract boolean uploadFile(String path);

    //NOVA - IMPL U TEST
    // STRING PERIOD U FORMATU "dd.mm.yyyy.-dd.mm.yyyy." PA DA SE PARSIRA
    public abstract void listFilesCreatedPeriod(String path, String period);

    public abstract void listAll(String path);

    public abstract void listFiles(String path);

    public abstract void listDirs(String path);

    public abstract void listByName(String path, String name);

    public abstract void renameFile(String path, String newName);

    public abstract void listFilesWithExt(String path, String extension);

    public abstract void listSubstringFiles(String path, String substring);

    public abstract boolean containsFile(String path, List<String> files);

    public abstract String returnDir(String path);

    public abstract void sortByName(String path, String marker, String order);

    public abstract void sortByDate(String path, String marker, String order);

    public abstract void sortByModification(String path, String marker, String order);

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}

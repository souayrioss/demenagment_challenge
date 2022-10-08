package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Migration {
    private List<Migratable> migratableList;
    public Migration(List<Migratable> amenagablesList) {
        this.migratableList = amenagablesList;
    }
    public Migration() {
        migratableList=new ArrayList<>();
    }

    public int getItemContainerId(String objectName){
        //assuming they are all cartons
        Optional<Migratable> optionalMigratable=migratableList.stream().filter(m-> ((Container)m).containsObject(objectName)).findFirst();
        if(optionalMigratable.isPresent()){
            return optionalMigratable.get().getId();
        }
        return -1;
    }

    public void addMigratable(Migratable migratable){
        migratableList.add(migratable);
    }

    public List<Migratable> getMigratableList() {
        return migratableList;
    }

    public void setMigratableList(List<Migratable> migratableList) {
        this.migratableList = migratableList;
    }

    @Override
    public String toString() {
        return "Migration[\n"+ migratableList +"\n]";
    }
}

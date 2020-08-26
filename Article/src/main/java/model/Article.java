package model;

public class Article {

    private String id;
    private String name;
    private String description;

    public Article() {
    }

    public Article(String id, String name, String description){
        this.id=id;
        this.name=name;
        this.description=description;
    }
    public String setId(){
        return id;
    }

    public String getId(){
        return id;
    }
    public String setName(){
        return name;
     }
    public String getName(){
        return name;
     }
    public String setDescription(){
        return description;
     }
    public String getDescription(){
        return description;
     }

}

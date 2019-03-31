package airlinesAPIdata;


public class MyPojoAirlines  
{
    private String name;

    private String id;

    private String lcc;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getLcc ()
    {
        return lcc;
    }

    public void setLcc (String lcc)
    {
        this.lcc = lcc;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", id = "+id+", lcc = "+lcc+"]";
    }
}
	
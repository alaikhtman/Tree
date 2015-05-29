import java.util.ArrayList;

/**
 * Created by Student on 29.05.2015.
 */
public class Node extends Component
{

    private ArrayList<Component> childs;

    public Node (String titel)
    {
        this.titel = titel;
        childs = new ArrayList<Component>();
    }


    public void add(Component item)
    {
        childs.add(item);
    }

    public int size()
    {
        return childs.size();
    }

    public Component get (int index)
    {
        return childs.get(index);
    }


    public void print ()
    {
        System.out.println(titel);
        for (Component c : childs) {
            c.print();
        }
    }

}

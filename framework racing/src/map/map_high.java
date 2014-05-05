package map;

public class map_high {
	private map_interface map_interface_ref;

    public map_high(map_interface map_interface_ref) {
        super();
        this.map_interface_ref = map_interface_ref;
    }

    public void create_map() {
        System.out.println("Create a high performance map");
        
        map_interface_ref.create_weather();
        map_interface_ref.create_house();
        map_interface_ref.create_tree();
        map_interface_ref.create_way();

    }
	
}

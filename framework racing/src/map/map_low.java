package map;

public abstract class map_low {
	private map_interface map_interface_ref;

    public map_low(map_interface map_interface_ref) {
        super();
        this.map_interface_ref = map_interface_ref;
    }

    public void create_map() {
        System.out.println("Create a low performance map");
        
        map_interface_ref.create_weather();
        map_interface_ref.create_house();
        //map_interface_ref.create_tree();
        map_interface_ref.create_way();

    }

}

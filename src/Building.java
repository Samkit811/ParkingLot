import java.util.HashMap;
import java.util.Map;

public class Building {
    Map<Integer, Floor> floorMap = new HashMap<>();
    int totalFloor;
    int perFloorCapacity;

    public Building(int totalFloor, int perFloorCapacity){
        this.totalFloor = totalFloor;
        this.perFloorCapacity = perFloorCapacity;

        for(int i=1;i<=totalFloor;i++){
            floorMap.put(i, new Floor(this.perFloorCapacity, i));
        }
    }

}

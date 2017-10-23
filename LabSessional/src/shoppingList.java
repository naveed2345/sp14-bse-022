
public class shoppingList implements Container {
	public int listCategory[] = {1,2,3,4};

	
	public shipmentCost getIterator() {
	
	return null;
	}

	public class Item implements shipmentCost{
	public int itamId;
	public String itemName;
	public int weight;

	int index;

	
	public boolean cost(){
	if(index < listCategory.length){
	return true;
	}
	return false;
	}

	
	public Object Cart() {

	if(this.cost()){
	float total=0;
	while(index < listCategory.length)
	total=total + listCategory[index++];
	

	}
	return null;
	}	
	}
	}



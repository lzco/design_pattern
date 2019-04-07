package name.lzc.pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 房屋中介  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 13:52:20  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class HouseMediator implements Mediator {

	private List<Demander> landlords = new ArrayList<>();
	private List<Demander> renters = new ArrayList<>();
	
	public void addLandlord(LandlordDemander landlordDemander) {
		landlords.add(landlordDemander);
	}
	
	public void addRenter(RenterDemander renterDemander) {
		renters.add(renterDemander);
	}
	
	@Override
	public void notice(Demander demander, String msg) {
		if(demander instanceof LandlordDemander) {
			for(Demander renter : renters) {
				renter.showMsg(msg);
			}
		}else if(demander instanceof RenterDemander) {
			for(Demander renter : landlords) {
				renter.showMsg(msg);
			}
		}
	}

}

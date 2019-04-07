package name.lzc.pattern.behavior.mediator;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 14:18:06  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class MediatorTest {

	//乍一看，很像观察者模式
	@Test
	public void test() {
		//房屋中介
		HouseMediator mediator = new HouseMediator();
		
		//关联房东与中介
		LandlordDemander landlord1 = new LandlordDemander(mediator); 
		mediator.addLandlord(landlord1);
		LandlordDemander landlord2 = new LandlordDemander(mediator); 
		mediator.addLandlord(landlord2);
		
		//关联求租者和中介
		RenterDemander renter = new RenterDemander(mediator);
		mediator.addRenter(renter);
		
		//租客发布求租消息，由中介通知房东
		renter.sendMsg("求租xx地附近，单身公寓，1500月/月左右");
		
		//房东发布招租消息，由中介通知求租者
		landlord1.sendMsg("xx地附近招租，单身公寓，1400元/月");
		landlord2.sendMsg("xx地附近招租，单身公寓，1600元/月");
	}

}

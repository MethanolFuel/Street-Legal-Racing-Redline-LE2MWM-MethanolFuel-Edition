package java.game.parts.CMS_Brakes;

import java.game.parts.rgearpart.reciprocatingrgearpart.brake.*;

public class brake_caliper_Endless_4 extends DiscBrake
{
	public brake_caliper_Endless_4( int id )
	{
		super( id );
		name = "Endless 4 POT";
		description = "Paintable";
		brand_new_prestige_value = 42.49;

		value = tHUF2USD(35.579);
		friction_pad		= 1.05;
		number_of_calipers	= 2.0;
	}
}
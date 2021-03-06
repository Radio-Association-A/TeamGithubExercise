package API;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("")
public class SampleAPI {

    @GET
    @Path("/add")
    public int addValues(@QueryParam("Value1") final int val1, @QueryParam("Value2") final int val2){

        return val1 + val2;
    }
    
    @GET
    @Path("/div")
    public int divValues(@QueryParam("Value1") final int val1, @QueryParam("Value2") final int val2) {
    	return val1/val2;
    }

    @GET
    @Path("/multiplication")
    public int multiplyValues(@QueryParam("Value1") final int val1, @QueryParam("Value2") final int val2){

        return val1 * val2;
    }

    @GET
    @Path("/sub")
    public int subValues(@QueryParam("Value1") final int val1, @QueryParam("Value2") final int val2){

        return val1 - val2;
    }


}

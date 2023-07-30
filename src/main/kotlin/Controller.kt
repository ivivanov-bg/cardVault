
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
class Controller {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun cards() : List<Card>  {
       return listOf<Card>()
    }
}
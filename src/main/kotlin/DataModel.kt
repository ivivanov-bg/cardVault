
import jakarta.persistence.*
import java.util.UUID
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheEntityBase


@Entity
open class User : PanacheEntityBase() {
    @Id
    open var id: UUID? = null, 

    @Column 
    open var name: String? = null,
}
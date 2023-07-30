
import jakarta.persistence.*
import java.util.UUID
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheEntityBase


@Entity
open class Account : PanacheEntityBase {
    @Id
    open lateinit var id: UUID

    @Column 
    open lateinit var name: String
    
    @Column 
    open lateinit var email: String
    
    @Column 
    open lateinit var passowrd: String
}

@Entity
open class Vendor : PanacheEntityBase {
    @Id
    open lateinit var id: UUID

    @Column 
    open lateinit var name: String
    
    @Column 
    open lateinit var image: String
    
    @Column 
    open lateinit var url: String
}

@Entity
open class Card : PanacheEntityBase {
    @Id
    open lateinit var id: UUID
    
    @ManyToOne
    open lateinit var vendor: Vendor
    
    @ManyToOne
    open lateinit var account: Account
    
    @Column
    open lateinit var name: String
    
    @Column 
    open lateinit var code: String
    
    @Column 
    open lateinit var fImage: String
    
    @Column 
    open lateinit var bImage: String
}


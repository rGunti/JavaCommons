package ch.rgunti.java.spring.data;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public abstract class BaseModel implements EntityObject {

    // -- Column Names
    public static final String COLUMN_ID = "id";
    protected static final String COLUMN_VERSION = "version";
    protected static final String COLUMN_CREATED_AT = "created_at";
    protected static final String COLUMN_MODIFIED_AT = "modified_at";

    // -- Columns

    @Id
    @Column(name = COLUMN_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name=COLUMN_VERSION, nullable = false)
    @Version
    private Long version;

    @Column(name=COLUMN_CREATED_AT, nullable = false)
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name=COLUMN_MODIFIED_AT, nullable = false)
    @LastModifiedDate
    private LocalDateTime modifiedAt = LocalDateTime.now();

    // -- Properties

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }
    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}

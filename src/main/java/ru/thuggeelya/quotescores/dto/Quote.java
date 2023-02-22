package ru.thuggeelya.quotescores.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Quote {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "posted_by_id")
    private User postedBy;

    @Column(name = "content")
    private String content;

    @Temporal(TemporalType.DATE)
    @Column(name = "publication_date")
    private Date publicationDate;

    @Column(name = "votes_count", nullable = false)
    private BigInteger votesCount = BigInteger.ZERO;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Quote quote = (Quote) o;
        return id != null && Objects.equals(id, quote.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

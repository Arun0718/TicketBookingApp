package com.cg.sweet.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.sweet.model.Offer;
import java.util.Optional;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {
     Optional<Offer> findByIdAndSweetId(Integer offerId, Integer sweetId);
}

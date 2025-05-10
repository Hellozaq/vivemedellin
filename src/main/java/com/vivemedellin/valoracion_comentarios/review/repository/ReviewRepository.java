package com.vivemedellin.valoracion_comentarios.review.repository;

import com.vivemedellin.valoracion_comentarios.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByEventId(Long eventId);
    Optional<Review> findByEventIdAndUserId(Long eventId, UUID userId);
    Optional<Review> findByIdAndUserId(Long eventId, UUID userId);

}

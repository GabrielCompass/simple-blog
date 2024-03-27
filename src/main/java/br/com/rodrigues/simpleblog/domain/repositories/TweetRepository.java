package br.com.rodrigues.simpleblog.domain.repositories;

import br.com.rodrigues.simpleblog.domain.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}

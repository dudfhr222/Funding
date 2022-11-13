package com.funding.FundArtist;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FundArtistRepository extends JpaRepository<FundArtist, Integer>{
	Optional<FundArtist> findByusername(String username);
}

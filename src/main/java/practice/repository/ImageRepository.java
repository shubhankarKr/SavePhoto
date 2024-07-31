package practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import practice.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	
}
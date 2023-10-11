package com.codecademy.boots.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.boots.entities.Boot;
import com.codecademy.boots.enums.BootType;

public interface BootRepository extends CrudRepository<Boot, Integer> {
    // Find boots by size
    public List<Boot> findBySize(Float size);

    // Find boots by material
    public List<Boot> findByMaterial(String material);

    // Find boots by type
    public List<Boot> findByType(BootType type);

    // Find boots with quantity greater than a specified minimum
    public List<Boot> findByQuantityGreaterThan(Integer minQuantity);

    // Find boots by both material and size
    public List<Boot> findByMaterialsAndSize(String material, Float size);

    // Find boots by material and with quantity greater than a specified minimum
    public List<Boot> findByMaterialAndQuantityGreaterThan(String material, Integer minQuantity);

    // Find boots by material and type
    public List<Boot> findByMaterialAndType(String material, BootType type);

    // Find boots by material, size, and type
    public List<Boot> findByMaterialAndSizeAndType(String material, Float size, BootType type);

    // Find boots by material, size, type, and quantity greater than a specified minimum
    public List<Boot> findByMaterialAndSizeAndTypeAndQuantityGreaterThan(String material, Float size, BootType type, Integer minQuantity);

    // Find boots by type and size
    public List<Boot> findByTypeAndSize(BootType type, Float size);

    // Find boots by type, size, and quantity greater than a specified minimum
    public List<Boot> findByTypeAndSizeAndQuantityGreaterThan(BootType type, Float size, Integer minQuantity);

    // Find boots by type and with quantity greater than a specified minimum
    public List<Boot> findByTypeAndQuantityGreaterThan(BootType type, Integer minQuantity);

    // Find boots by size and with quantity greater than a specified minimum
    public List<Boot> findBySizeAndQuantityGreaterThan(Float size, Integer minQuantity);
}

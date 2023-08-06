package com.dash.dash.repository;
import com.dash.dash.entity.dashinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface DataRepository extends JpaRepository<dashinfo, Long> {
    @Query(value = "SELECT DISTINCT end_year FROM dash_info", nativeQuery = true)
    List<Integer> getAllEndYears();
    @Query(value = "SELECT DISTINCT intensity FROM dash_info", nativeQuery = true)
    List<String> getAllIntensities();
    @Query(value = "SELECT DISTINCT sector FROM dash_info WHERE sector IS NOT NULL", nativeQuery = true)
    List<String> getAllSectors();
}

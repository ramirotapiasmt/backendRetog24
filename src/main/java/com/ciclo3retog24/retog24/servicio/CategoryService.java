package com.ciclo3retog24.retog24.servicio;

import com.ciclo3retog24.retog24.entidad.Category;
import com.ciclo3retog24.retog24.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    /**
     * Mostrar datos
     */

    public List<Category> getCategories(){
        return repository.findAll();

    }
    public Category saveCategory(Category category){
        return repository.save(category);
    }
}

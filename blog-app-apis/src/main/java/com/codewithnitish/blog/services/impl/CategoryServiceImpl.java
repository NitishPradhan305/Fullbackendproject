package com.codewithnitish.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithnitish.blog.entities.Category;
import com.codewithnitish.blog.exceptions.ResourceNotFoundException;
import com.codewithnitish.blog.payloads.CategoryDto;
import com.codewithnitish.blog.repositories.CategoryRepo;
import com.codewithnitish.blog.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		Category category2 = this.categoryRepo.save(category);
		CategoryDto categoryDto2 = this.modelMapper.map(category2, CategoryDto.class);
		return categoryDto2;
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "CategoryId", categoryId));
		
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		
		Category cat2 = this.categoryRepo.save(cat);
		CategoryDto addedcatDto = this.modelMapper.map(cat2, CategoryDto.class);
		return addedcatDto;
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category", "CategoryId", categoryId));
		this.categoryRepo.delete(cat);
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category", "CategoryId", categoryId));
		CategoryDto categoryDto = this.modelMapper.map(cat, CategoryDto.class);
		return categoryDto;
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Category> findAll = this.categoryRepo.findAll();
		List<CategoryDto> listDtos = findAll.stream().map((data)->this.modelMapper.map(data,CategoryDto.class)).collect(Collectors.toList());
		return listDtos;
	}

}

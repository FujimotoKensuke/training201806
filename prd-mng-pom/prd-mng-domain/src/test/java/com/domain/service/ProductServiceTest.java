/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.service;

import com.domain.form.RegistrationForm;
import com.domain.model.ProductModel;
import com.domain.model.ProductModelFactory;
import com.domain.repository.ProductRepository;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.util.ReflectionTestUtils;

/**
 *
 * @author owner
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ProductServiceTest {
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;
    
    public ProductServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        productService = new ProductServiceImpl();
        // RepositoryをMock化
        ReflectionTestUtils.setField(productService, "productRepository", productRepository);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class ProductService.
     */
    @Test
    public void testCreate_正常系() {
        // データ準備
        RegistrationForm form = new RegistrationForm();
        form.setProductId(1);
        form.setProductCd("productCd");
        form.setProductName("productName");
        form.setPrice(100);
        ProductModel model = ProductModelFactory.create(form);

        // 実行
        productService.create(model);

        // 確認
        verify(productRepository, times(1)).insertProduct(model);
    }
    

    /**
     * Test of update method, of class ProductService.
     */
    @Test
    public void testUpdate_正常系() {
         // データ準備
        RegistrationForm form = new RegistrationForm();
        form.setProductCd("updateProductCd");
        form.setProductName("updateProductName");
        form.setPrice(150);
        ProductModel model = ProductModelFactory.create(form);

        // 実行
        productService.update(model);

        // 確認
        verify(productRepository, times(1)).updateProduct(model);
    }

    /**
     * Test of getProductList method, of class ProductService.
     */
    @Test
    public void testGetProductList() {
    }
    
}

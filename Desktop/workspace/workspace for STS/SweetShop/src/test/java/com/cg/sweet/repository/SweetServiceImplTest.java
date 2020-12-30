/*
 * package com.cg.sweet.repository;
 * 
 * import static org.assertj.core.api.Assertions.assertThat;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.Assert; import org.junit.Test; import
 * org.junit.runner.RunWith; import org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * 
 * import com.cg.sweet.model.Sweet; import com.cg.sweet.service.SweetService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest public class SweetServiceImplTest {
 * 
 * @MockBean private SweetRepository sweetRepository;
 * 
 * @Autowired private SweetService sweetService;
 * 
 * @Test public void testCreateSweet() { Sweet sweet = new Sweet();
 * sweet.setSweetId(100); sweet.setCategoryName("MilkSweet");
 * sweet.setProductName("laddu"); sweet.setRate(200.0);
 * 
 * Mockito.when(sweetRepository.save(sweet)).thenReturn(sweet);
 * assertThat(sweetService.createSweet(sweet)).isEqualTo(sweet); }
 * 
 * @Test public void testGetAllSweets() throws Exception{ Sweet sweet1 = new
 * Sweet(); sweet1.setSweetId(101); sweet1.setCategoryName("TraditionalSweet");
 * sweet1.setProductName("halwa"); sweet1.setRate(100.0);
 * 
 * Sweet sweet2 = new Sweet(); sweet2.setSweetId(102);
 * sweet2.setCategoryName("GheeSweet"); sweet2.setProductName("gulab Jamun");
 * sweet2.setRate(100.0);
 * 
 * List<Sweet> sweetList = new ArrayList<>(); sweetList.add(sweet1);
 * sweetList.add(sweet2);
 * 
 * Mockito.when(sweetRepository.findAll()).thenReturn(sweetList);
 * assertThat(sweetService.getSweet().isEqualTo(sweetList);
 * 
 * }
 * 
 * @Test public void testDeleteSweetById() throws Exception{ Sweet sweet = new
 * Sweet(); sweet.setSweetId(105); sweet.setCategoryName("TraditionalSweet");
 * sweet.setProductName("halwa"); sweet.setRate(100.0);
 * 
 * Mockito.when(sweetRepository.save(sweet)).thenReturn(sweet);
 * Mockito.when(sweetRepository.findById(105).get()).thenReturn(sweet);
 * sweetRepository.deleteById(sweet.getSweetId());
 * Mockito.when(sweetRepository.findById(105).get()).thenReturn(sweet);
 * Assert.assertNotEquals(sweet, new Sweet());
 * Assert.assertEquals(sweetService.deleteSweet(105),false);
 * 
 * 
 * }
 * 
 * @Test public void testDeleteSweetByNull() throws Exception{ Sweet sweet = new
 * Sweet(); sweet.setSweetId(1005); Sweet nullSweet = null;
 * Mockito.when(sweetRepository.findById(1005).get()).thenReturn(nullSweet);
 * sweetRepository.deleteById(sweet.getSweetId());
 * Assert.assertEquals(sweetService.deleteSweet(1005), true);
 * 
 * }
 * 
 * @Test public void testUpdateTicket() throws Exception{ Sweet sweet2= new
 * Sweet(); sweet2.setSweetId(100); sweet2.setCategoryName("milkghee");
 * sweet2.setProductName("Laddu"); sweet2.setRate(150.0);
 * 
 * Mockito.when(sweetRepository.findById(100).get()).thenReturn(sweet2);
 * sweet2.setProductName("jamun");
 * Mockito.when(sweetRepository.save(sweet2)).thenReturn(sweet2);
 * System.out.println(sweet2.getProductName());
 * assertThat(sweetService.updateSweet(100,"jamun")).isEqualTo(sweet2); } }
 */
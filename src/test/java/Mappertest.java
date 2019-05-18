import com.test.mapper.TbBrandMapper;
import com.test.pojo.TbBrand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author ChuanLv
 * @version v1.0
 * @date 2019/5/18 20:21
 * @description TODO
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class Mappertest {
    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Test
    public void test01(){
        List<TbBrand> all = tbBrandMapper.findAll();
        for (TbBrand tbBrand : all) {
            System.out.println(tbBrand);
        }
    }
}

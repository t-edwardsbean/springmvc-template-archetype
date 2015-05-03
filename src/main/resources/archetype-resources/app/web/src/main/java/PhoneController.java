package ${package};

import com.edwardsbean.timo.service.model.Msg;
import ${package}.biz.PhoneService;
import ${package}.dal.entity.Phone;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PhoneController {
    @Autowired
    PhoneService phoneService;

    @ApiOperation(value = "查看手机日志")
    @RequestMapping(value = "/phones/{id}", method = RequestMethod.GET)
    public Msg get(@ApiParam(required = true, value = "手机日志id") @PathVariable long id) {
        Msg msg = new Msg();
        msg.setReturnData(phoneService.getPhone(id));
        return msg;
    }

    @ApiOperation(value = "上传手机日志")
    @RequestMapping(value = "/phones", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public Msg post(@ApiParam(required = true,name = "content", value = "手机日志内容") @RequestParam String content) {
        Phone phone = new Phone();
        phone.setContent(content);
        int id = phoneService.insertPhone(phone);
        Msg msg = new Msg();
        msg.setReturnData(id);
        return msg;
    }
	
	@ApiOperation(value = "上传JSON日志",consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/phones/logs", produces = MediaType.APPLICATION_JSON_VALUE)
    public Msg upload(@RequestBody Phone phone) {
        Msg msg = new Msg();
        msg.setReturnData(phone);
        return msg;
    }
}
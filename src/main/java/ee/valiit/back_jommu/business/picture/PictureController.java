package ee.valiit.back_jommu.business.picture;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/photo", produces = MediaType.APPLICATION_JSON_VALUE)
public class PictureController {

    @Resource
    private PictureService pictureService;

    @PatchMapping("")
    @Operation(summary = "Lisab harjutusele pildi kasutades exTempID-d")
    public void addExTempPicture(@RequestBody PictureDto request) {
        pictureService.addPicture(request);
    }

    @GetMapping("")
    @Operation(summary = "Leiab harjutusele pildi kasutades exerciseTempId-d")
    public PictureDto getPicture(@RequestParam Integer exerciseTempId) {
       return pictureService.getPicture(exerciseTempId);
    }
}

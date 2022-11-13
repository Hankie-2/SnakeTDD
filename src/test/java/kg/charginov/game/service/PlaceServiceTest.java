package kg.charginov.game.service;

import junit.framework.TestCase;
import kg.charginov.game.model.Place;
import kg.charginov.game.service.impl.PlaceServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;

public class PlaceServiceTest extends TestCase {

    private PlaceService service;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        this.service = new PlaceServiceImpl();
    }

    public void testCreatePlace() {
        Place place1 = service.createPlace();
        assertThat(place1).isNotNull();
    }
}
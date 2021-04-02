// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.lib.enzo {

    // Direct dependencies modules
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires webfx.kit.util;
    requires webfx.platform.client.uischeduler;
    requires webfx.platform.shared.scheduler;

    // Exported packages
    exports eu.hansolo.enzo.clock;
    exports eu.hansolo.enzo.clock.skin;
    exports eu.hansolo.enzo.flippanel;
    exports eu.hansolo.enzo.fonts;

    // Resources packages
    opens eu.hansolo.enzo.clock;

}
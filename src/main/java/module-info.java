// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.lib.enzo {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires webfx.kit.util;
    requires webfx.platform.scheduler;
    requires webfx.platform.uischeduler;

    // Exported packages
    exports eu.hansolo.enzo.clock;
    exports eu.hansolo.enzo.clock.skin;
    exports eu.hansolo.enzo.flippanel;
    exports eu.hansolo.enzo.fonts;

    // Resources packages
    opens eu.hansolo.enzo.clock;

}
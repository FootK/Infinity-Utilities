package infinityutilities.screen;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.CommandSuggestions;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;

public abstract class spaceStone_gui extends Screen {
    private static final Component SET_COMMAND_LABEL = Component.translatable("advMode.setCommand");
    private static final Component COMMAND_LABEL = Component.translatable("advMode.command");
    private static final Component PREVIOUS_OUTPUT_LABEL = Component.translatable("advMode.previousOutput");
    protected EditBox xEdit;
    protected EditBox yEdit;
    protected EditBox zEdit;
    protected EditBox DimensionEdit;
    protected Button doneButton;
    protected Button cancelButton;
    CommandSuggestions commandSuggestions;

    protected spaceStone_gui(Component p_96550_) {
        super(p_96550_);
    }


    public void tick() {
        this.xEdit.tick();
        this.yEdit.tick();
        this.zEdit.tick();
        this.DimensionEdit.tick();
    }


    protected void init() {
        this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
        this.doneButton = this.addRenderableWidget(new Button(this.width / 2 - 4 - 150, this.height / 4 + 120 + 12, 150, 20, CommonComponents.GUI_DONE, (p_97691_) -> {
            this.onDone();
        }));
        this.cancelButton = this.addRenderableWidget(new Button(this.width / 2 + 4, this.height / 4 + 120 + 12, 150, 20, CommonComponents.GUI_CANCEL, (p_97687_) -> {
            this.onClose();
        }));

        this.xEdit = new EditBox(this.font, this.width / 2 - 150, 50, 300, 20, Component.translatable("advMode.command"));
        this.yEdit = new EditBox(this.font, this.width / 2 - 150, 50, 300, 20, Component.translatable("advMode.command"));
        this.zEdit = new EditBox(this.font, this.width / 2 - 150, 50, 300, 20, Component.translatable("advMode.command"));

// Coords
    // X
        this.xEdit.setMaxLength(8);
        this.addWidget(this.xEdit);
        this.setInitialFocus(this.xEdit);
        this.xEdit.setFocus(true);

    // Y
        this.yEdit.setMaxLength(8);
        this.addWidget(this.yEdit);
        this.setInitialFocus(this.yEdit);
        this.yEdit.setFocus(true);

    // Z
        this.zEdit.setMaxLength(8);
        this.addWidget(this.zEdit);
        this.setInitialFocus(this.zEdit);
        this.zEdit.setFocus(true);

        this.DimensionEdit.setMaxLength(20);
        this.addWidget(this.DimensionEdit);
        this.setInitialFocus(this.DimensionEdit);
        this.DimensionEdit.setFocus(true);
    }
    // Dimension


    protected void onDone() {
        this.minecraft.setScreen((Screen)null);
    }


    public boolean keyPressed(int p_97667_, int p_97668_, int p_97669_) {
        if (super.keyPressed(p_97667_, p_97668_, p_97669_)) {
            return true;
        } else if (p_97667_ != 257 && p_97667_ != 335) {
            return false;
        } else {
            this.onDone();
            return true;
        }
    }

    public void render(PoseStack p_97672_, int p_97673_, int p_97674_, float p_97675_) {
        this.renderBackground(p_97672_);
        drawCenteredString(p_97672_, this.font, SET_COMMAND_LABEL, this.width / 2, 20, 16777215);
        drawString(p_97672_, this.font, COMMAND_LABEL, this.width / 2 - 150, 40, 10526880);
        this.xEdit.render(p_97672_, p_97673_, p_97674_, p_97675_);
        this.yEdit.render(p_97672_, p_97673_, p_97674_, p_97675_);
        this.zEdit.render(p_97672_, p_97673_, p_97674_, p_97675_);

        super.render(p_97672_, p_97673_, p_97674_, p_97675_);
    }
}


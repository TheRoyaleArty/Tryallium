
package fr.thearty.machinetryallium.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.GuiButton;

import fr.thearty.machinetryallium.procedure.ProcedureOuvrecoffe2;
import fr.thearty.machinetryallium.MachinetryalliumMod;
import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import java.io.IOException;

@ElementsMachinetryalliumMod.ModElement.Tag
public class GuiTryalliumcoffre2 extends ElementsMachinetryalliumMod.ModElement {
	public static int GUIID = 11;
	public static HashMap guistate = new HashMap();
	public GuiTryalliumcoffre2(ElementsMachinetryalliumMod instance) {
		super(instance, 189);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
		elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
	}
	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		private IInventory internal;
		private World world;
		private EntityPlayer entity;
		private int x, y, z;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		public GuiContainerMod(World world, int x, int y, int z, EntityPlayer player) {
			this.world = world;
			this.entity = player;
			this.x = x;
			this.y = y;
			this.z = z;
			this.internal = new InventoryBasic("", true, 4198499);
			TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
			if (ent instanceof IInventory)
				this.internal = (IInventory) ent;
			this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 24, 27) {
			}));
			this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 43, 27) {
			}));
			this.customSlots.put(2, this.addSlotToContainer(new Slot(internal, 2, 62, 27) {
			}));
			this.customSlots.put(3, this.addSlotToContainer(new Slot(internal, 3, 81, 27) {
			}));
			this.customSlots.put(4, this.addSlotToContainer(new Slot(internal, 4, 100, 27) {
			}));
			this.customSlots.put(5, this.addSlotToContainer(new Slot(internal, 5, 119, 27) {
			}));
			this.customSlots.put(6, this.addSlotToContainer(new Slot(internal, 6, 138, 27) {
			}));
			this.customSlots.put(7, this.addSlotToContainer(new Slot(internal, 7, 157, 27) {
			}));
			this.customSlots.put(8, this.addSlotToContainer(new Slot(internal, 8, 176, 27) {
			}));
			this.customSlots.put(9, this.addSlotToContainer(new Slot(internal, 9, 195, 27) {
			}));
			this.customSlots.put(10, this.addSlotToContainer(new Slot(internal, 10, 215, 27) {
			}));
			this.customSlots.put(11, this.addSlotToContainer(new Slot(internal, 11, 5, 27) {
			}));
			this.customSlots.put(13, this.addSlotToContainer(new Slot(internal, 13, 5, 46) {
			}));
			this.customSlots.put(14, this.addSlotToContainer(new Slot(internal, 14, 23, 46) {
			}));
			this.customSlots.put(15, this.addSlotToContainer(new Slot(internal, 15, 42, 46) {
			}));
			this.customSlots.put(16, this.addSlotToContainer(new Slot(internal, 16, 62, 46) {
			}));
			this.customSlots.put(17, this.addSlotToContainer(new Slot(internal, 17, 81, 46) {
			}));
			this.customSlots.put(18, this.addSlotToContainer(new Slot(internal, 18, 100, 46) {
			}));
			this.customSlots.put(19, this.addSlotToContainer(new Slot(internal, 19, 119, 46) {
			}));
			this.customSlots.put(20, this.addSlotToContainer(new Slot(internal, 20, 138, 46) {
			}));
			this.customSlots.put(21, this.addSlotToContainer(new Slot(internal, 21, 157, 46) {
			}));
			this.customSlots.put(22, this.addSlotToContainer(new Slot(internal, 22, 176, 46) {
			}));
			this.customSlots.put(23, this.addSlotToContainer(new Slot(internal, 23, 195, 46) {
			}));
			this.customSlots.put(24, this.addSlotToContainer(new Slot(internal, 24, 215, 46) {
			}));
			this.customSlots.put(26, this.addSlotToContainer(new Slot(internal, 26, 5, 64) {
			}));
			this.customSlots.put(27, this.addSlotToContainer(new Slot(internal, 27, 23, 64) {
			}));
			this.customSlots.put(28, this.addSlotToContainer(new Slot(internal, 28, 42, 64) {
			}));
			this.customSlots.put(29, this.addSlotToContainer(new Slot(internal, 29, 61, 64) {
			}));
			this.customSlots.put(30, this.addSlotToContainer(new Slot(internal, 30, 81, 64) {
			}));
			this.customSlots.put(31, this.addSlotToContainer(new Slot(internal, 31, 100, 64) {
			}));
			this.customSlots.put(32, this.addSlotToContainer(new Slot(internal, 32, 119, 64) {
			}));
			this.customSlots.put(33, this.addSlotToContainer(new Slot(internal, 33, 138, 64) {
			}));
			this.customSlots.put(34, this.addSlotToContainer(new Slot(internal, 34, 157, 64) {
			}));
			this.customSlots.put(35, this.addSlotToContainer(new Slot(internal, 35, 176, 64) {
			}));
			this.customSlots.put(36, this.addSlotToContainer(new Slot(internal, 36, 195, 64) {
			}));
			this.customSlots.put(37, this.addSlotToContainer(new Slot(internal, 37, 215, 64) {
			}));
			this.customSlots.put(48, this.addSlotToContainer(new Slot(internal, 48, 5, 7) {
			}));
			this.customSlots.put(757, this.addSlotToContainer(new Slot(internal, 757, 24, 7) {
			}));
			this.customSlots.put(58549, this.addSlotToContainer(new Slot(internal, 58549, 43, 7) {
			}));
			this.customSlots.put(446, this.addSlotToContainer(new Slot(internal, 446, 62, 7) {
			}));
			this.customSlots.put(6694, this.addSlotToContainer(new Slot(internal, 6694, 81, 7) {
			}));
			this.customSlots.put(9945, this.addSlotToContainer(new Slot(internal, 9945, 100, 7) {
			}));
			this.customSlots.put(98498, this.addSlotToContainer(new Slot(internal, 98498, 119, 7) {
			}));
			this.customSlots.put(855, this.addSlotToContainer(new Slot(internal, 855, 138, 7) {
			}));
			this.customSlots.put(4198498, this.addSlotToContainer(new Slot(internal, 4198498, 157, 7) {
			}));
			this.customSlots.put(4172, this.addSlotToContainer(new Slot(internal, 4172, 176, 7) {
			}));
			this.customSlots.put(899, this.addSlotToContainer(new Slot(internal, 899, 195, 7) {
			}));
			this.customSlots.put(57858, this.addSlotToContainer(new Slot(internal, 57858, 215, 7) {
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 42 + 8 + sj * 18, 20 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlotToContainer(new Slot(player.inventory, si, 42 + 8 + si * 18, 20 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(EntityPlayer player) {
			return internal.isUsableByPlayer(player);
		}

		@Override
		public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 48) {
					if (!this.mergeItemStack(itemstack1, 48, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 48, false)) {
					if (index < 48 + 27) {
						if (!this.mergeItemStack(itemstack1, 48 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 48, 48 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override /**
					 * Merges provided ItemStack with the first avaliable one in the
					 * container/player inventor between minIndex (included) and maxIndex
					 * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
					 * Container implementation do not check if the item is valid for the slot
					 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && itemstack.getItem() == stack.getItem()
							&& (!stack.getHasSubtypes() || stack.getMetadata() == itemstack.getMetadata())
							&& ItemStack.areItemStackTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.splitStack(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.splitStack(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(EntityPlayer playerIn) {
			super.onContainerClosed(playerIn);
			if ((internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
				this.clearContainer(playerIn, playerIn.world, internal);
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote) {
				MachinetryalliumMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class GuiWindow extends GuiContainer {
		private World world;
		private int x, y, z;
		private EntityPlayer entity;
		public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
			super(new GuiContainerMod(world, x, y, z, entity));
			this.world = world;
			this.x = x;
			this.y = y;
			this.z = z;
			this.entity = entity;
			this.xSize = 260;
			this.ySize = 205;
		}
		private static final ResourceLocation texture = new ResourceLocation("machinetryallium:textures/tryalliumcoffre2.png");
		@Override
		public void drawScreen(int mouseX, int mouseY, float partialTicks) {
			this.drawDefaultBackground();
			super.drawScreen(mouseX, mouseY, partialTicks);
			this.renderHoveredToolTip(mouseX, mouseY);
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(texture);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
			zLevel = 100.0F;
		}

		@Override
		public void updateScreen() {
			super.updateScreen();
		}

		@Override
		protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
			super.mouseClicked(mouseX, mouseY, mouseButton);
		}

		@Override
		protected void keyTyped(char typedChar, int keyCode) throws IOException {
			super.keyTyped(typedChar, keyCode);
		}

		@Override
		protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		}

		@Override
		public void onGuiClosed() {
			super.onGuiClosed();
			Keyboard.enableRepeatEvents(false);
		}

		@Override
		public void initGui() {
			super.initGui();
			this.guiLeft = (this.width - 260) / 2;
			this.guiTop = (this.height - 205) / 2;
			Keyboard.enableRepeatEvents(true);
			this.buttonList.clear();
			this.buttonList.add(new GuiButton(0, this.guiLeft + 246, this.guiTop + 8, 10, 20, "1"));
		}

		@Override
		protected void actionPerformed(GuiButton button) {
			MachinetryalliumMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.id, x, y, z));
			handleButtonAction(entity, button.id, x, y, z);
		}

		@Override
		public boolean doesGuiPauseGame() {
			return false;
		}
	}

	public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			return null;
		}
	}

	public static class GUISlotChangedMessageHandler implements IMessageHandler<GUISlotChangedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUISlotChangedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			return null;
		}
	}

	public static class GUIButtonPressedMessage implements IMessage {
		int buttonID, x, y, z;
		public GUIButtonPressedMessage() {
		}

		public GUIButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(buttonID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			buttonID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
		}
	}

	public static class GUISlotChangedMessage implements IMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage() {
		}

		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(slotID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
			buf.writeInt(changeType);
			buf.writeInt(meta);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			slotID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
			changeType = buf.readInt();
			meta = buf.readInt();
		}
	}
	private static void handleButtonAction(EntityPlayer entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureOuvrecoffe2.executeProcedure($_dependencies);
			}
		}
	}

	private static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}

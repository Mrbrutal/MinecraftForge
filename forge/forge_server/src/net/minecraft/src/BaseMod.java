package net.minecraft.src;

import java.util.Map;
import java.util.Random;

public abstract class BaseMod
{
    public BaseMod()
    {
    }

    public int AddFuel(int i, int j)
    {
        return 0;
    }

    public void AddRenderer(Map map)
    {
    }

    public boolean DispenseEntity(World world, double d, double d1, double d2, int i, int j, ItemStack itemstack)
    {
        return false;
    }

    public void GenerateNether(World world, Random random, int i, int j)
    {
    }

    public void GenerateSurface(World world, Random random, int i, int j)
    {
    }

    public String getName()
    {
        return getClass().getSimpleName();
    }

    public String getPriorities()
    {
        return "";
    }

    public abstract String getVersion();

    public abstract void load();

    public void ModsLoaded()
    {
    }

    public void OnItemPickup(EntityPlayer entityplayer, ItemStack itemstack)
    {
    }

    public boolean OnTickInGame(World world) //Changed from taking a reference to Minecraft, to taking a reference to the world.
    {
        return false;
    }

    public void TakenFromCrafting(EntityPlayer entityplayer, ItemStack itemstack, IInventory iinventory)
    {
    }

    public void TakenFromFurnace(EntityPlayer entityplayer, ItemStack itemstack)
    {
    }

    public String toString()
    {
        return getName() + ' ' + getVersion();
    }

    /* TODO: Move to a Client Side Only Interface
    public void KeyboardEvent(KeyBinding keybinding)
    {
    }

    public boolean OnTickInGUI(float f, Minecraft minecraft, GuiScreen guiscreen)
    {
        return false;
    }

    public void RegisterAnimation(Minecraft minecraft)
    {
    }

    public void RenderInvBlock(RenderBlocks renderblocks, Block block, int i, int j)
    {
    }

    public boolean RenderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int i, int j, int k, Block block, int l)
    {
        return false;
    }
    */
}
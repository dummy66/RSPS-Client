/*



*/

import sign.signlink;
import java.util.Random;


public class Class30_Sub2_Sub1_Sub3 extends Class30_Sub2_Sub1
{

    public static final void method363(int i)
    {
        anIntArray1468 = null;
        anIntArray1468 = null;
        anIntArray1470 = null;
        anIntArray1471 = null;
        anIntArray1472 = null;
        aClass30_Sub2_Sub1_Sub2Array1474 = null;
        aBooleanArray1475 = null;
        anIntArray1476 = null;
        anIntArrayArray1478 = null;
        anIntArrayArray1479 = null;
        anIntArray1480 = null;
        anIntArray1482 = null;
        anIntArrayArray1483 = null;
        if(i >= 0)
        {
            for(int j = 1; j > 0; j++);
        }
    }

    public static final void method364(byte byte0)
    {
        anIntArray1472 = new int[Class30_Sub2_Sub1.anInt1380];
        if(byte0 == 6)
        {
            byte0 = 0;
        } else
        {
            for(int i = 1; i > 0; i++);
        }
        for(int j = 0; j < Class30_Sub2_Sub1.anInt1380; j++)
            anIntArray1472[j] = Class30_Sub2_Sub1.anInt1379 * j;

        anInt1466 = Class30_Sub2_Sub1.anInt1379 / 2;
        anInt1467 = Class30_Sub2_Sub1.anInt1380 / 2;
    }

    public static final void method365(int i, int j, int k)
    {
        for(anIntArray1472 = new int[k]; i >= 0;)
            return;

        for(int l = 0; l < k; l++)
            anIntArray1472[l] = j * l;

        anInt1466 = j / 2;
        anInt1467 = k / 2;
    }

    public static final void method366(int i)
    {
        if(i < 0 || i > 0)
            return;
        anIntArrayArray1478 = null;
        for(int j = 0; j < 50; j++)
            anIntArrayArray1479[j] = null;

    }

    public static final void method367(int i, boolean flag)
    {
        if(!flag)
        {
            for(int j = 1; j > 0; j++);
        }
        if(anIntArrayArray1478 == null)
        {
            anInt1477 = i;
            if(aBoolean1461)
                anIntArrayArray1478 = new int[anInt1477][16384];
            else
                anIntArrayArray1478 = new int[anInt1477][0x10000];
            for(int k = 0; k < 50; k++)
                anIntArrayArray1479[k] = null;

        }
    }

    public static final void method368(Class44 class44, int i)
    {
        anInt1473 = 0;
        if(i != 0)
            aBoolean1460 = !aBoolean1460;
        for(int j = 0; j < 50; j++)
            try
            {
                aClass30_Sub2_Sub1_Sub2Array1474[j] = new Class30_Sub2_Sub1_Sub2(class44, String.valueOf(j), 0);
                if(aBoolean1461 && aClass30_Sub2_Sub1_Sub2Array1474[j].anInt1456 == 128)
                    aClass30_Sub2_Sub1_Sub2Array1474[j].method356(false);
                else
                    aClass30_Sub2_Sub1_Sub2Array1474[j].method357(false);
                anInt1473++;
            }
            catch(Exception _ex) { }

    }

    public static final int method369(int i, int j)
    {
        if(j != 12660)
            return 2;
        if(anIntArray1476[i] != 0)
            return anIntArray1476[i];
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = anIntArrayArray1483[i].length;
        for(int k1 = 0; k1 < j1; k1++)
        {
            k += anIntArrayArray1483[i][k1] >> 16 & 0xff;
            l += anIntArrayArray1483[i][k1] >> 8 & 0xff;
            i1 += anIntArrayArray1483[i][k1] & 0xff;
        }

        int l1 = (k / j1 << 16) + (l / j1 << 8) + i1 / j1;
        l1 = method373(l1, 1.3999999999999999D);
        if(l1 == 0)
            l1 = 1;
        anIntArray1476[i] = l1;
        return l1;
    }

    public static final void method370(int i, int j)
    {
        if(anIntArrayArray1479[i] == null)
            return;
        anIntArrayArray1478[anInt1477++] = anIntArrayArray1479[i];
        while(j >= 0)
            anInt1458 = 7;
        anIntArrayArray1479[i] = null;
    }
//	public static int random(int range) {
//		return (int)(java.lang.Math.random() * (range+1));
//	}

    public static final int[] method371(int i)
    {
if (i == 40) { i = 40; }



				/* if (i >=1 && i <=50){
				 i = 1;
				 }
 */

		/*	 if (i >=1 && i <=50){
			 Random generator = new Random(32);

				 i = generator.nextInt(32);
			 }
	 */


	 	/*	Textures
	 *	50	suggests the end of the textures...
	 *	49	=	Something to do with 48, I assume
	 *	48	=	Hyroglyphs?
	 *	47	=	Extremely light wall colour...
	 *	46	=	Ground in varrock by the fountain
	 *	45	=	Door
	 *	44	=	Similar to 43; Darker
	 *	43	=	Buildings' stone wall
	 *	42	=	Sold blue, for those flowers in Varrock I believe
	 *	41	=	Bushes of some sort
	 *	40	=	lava
	 *	39	=	Painting of an elf
	 *	38	=	One of the new Falador textures
	 *	37	=	Same as 38
	 *	36	=	Door or floor texture?
	 *	35	=	New Falador walls
	 *	34	=	Magic tree stars
	 *	33	=	Maple tree leaves
	 *	32	=	Sand maybe?
	 *	31	=	Another lava overlay
	 *	30	=	Yew tree overlays
	 *	29	=	Sort of like fern leaves :\
	 *	28	=	???????????????????????
	 *	27	=	Snake skin
	 *	26	=	Spider webs
	 *	25	=	Water of some sort, I think
	 *	24	=	Flowing water
	 *	23	=	Dark buidling siding (something near Lumbridge I think?)
	 *	22	=	Wooden floor
	 *	21	=	Roofing maybe?
	 *	20	=	Book case
	 *	19	=	Something with.. holes..
	 *	18	=	Sand..or..something?
	 *	17	=	Water found water
	 *	16	=	Wooden roof I think.
	 *	15	=	Looks like an overlay for water?
	 *	14	=	Portrait of a king
	 *	13	=	Landscape of mountains
	 *	12	=	Bars on those jail doors, etc
	 *	11	=	Runecrafting altar \ mysterious rune texture
	 *	10	=	Solid blue...
	 *	9	=	Tree stumps
	 *	8	=	Tree leaves
	 *	7	=	Um.. Logs or something?
	 *	6	=	Red roofing
	 *	5	=	Really dark wood texture
	 *	4	=	Elven doors
	 *	3	=	Wooden flooring
	 *	2	=	Stone walls (i.e. on Varrock banks, etc)
	 *	1	=	Water
	 *	0	=	Door
	 **/




 //   	i = random(40);
        anIntArray1480[i] = anInt1481++;
        if(anIntArrayArray1479[i] != null)
            return anIntArrayArray1479[i];
        int ai[];
        if(anInt1477 > 0)
        {
            ai = anIntArrayArray1478[--anInt1477];
            anIntArrayArray1478[anInt1477] = null;
        } else
        {
            int j = 0;
            int k = -1;
            for(int l = 0; l < anInt1473; l++)
                if(anIntArrayArray1479[l] != null && (anIntArray1480[l] < j || k == -1))
                {
                    j = anIntArray1480[l];
                    k = l;
                }

            ai = anIntArrayArray1479[k];
            anIntArrayArray1479[k] = null;
        }
        anIntArrayArray1479[i] = ai;
        Class30_Sub2_Sub1_Sub2 class30_sub2_sub1_sub2 = aClass30_Sub2_Sub1_Sub2Array1474[i];
        int ai1[] = anIntArrayArray1483[i];
        if(aBoolean1461)
        {
            aBooleanArray1475[i] = false;
            for(int i1 = 0; i1 < 4096; i1++)
            {
                int i2 = ai[i1] = ai1[class30_sub2_sub1_sub2.aByteArray1450[i1]] & 0xf8f8ff;
                if(i2 == 0)
                    aBooleanArray1475[i] = true;
                ai[4096 + i1] = i2 - (i2 >>> 3) & 0xf8f8ff;
                ai[8192 + i1] = i2 - (i2 >>> 2) & 0xf8f8ff;
                ai[12288 + i1] = i2 - (i2 >>> 2) - (i2 >>> 3) & 0xf8f8ff;
            }

        } else
        {
            if(class30_sub2_sub1_sub2.anInt1452 == 64)
            {
                for(int j1 = 0; j1 < 128; j1++)
                {
                    for(int j2 = 0; j2 < 128; j2++)
                        ai[j2 + (j1 << 7)] = ai1[class30_sub2_sub1_sub2.aByteArray1450[(j2 >> 1) + ((j1 >> 1) << 6)]];

                }

            } else
            {
                for(int k1 = 0; k1 < 16384; k1++)
                    ai[k1] = ai1[class30_sub2_sub1_sub2.aByteArray1450[k1]];

            }
            aBooleanArray1475[i] = false;
            for(int l1 = 0; l1 < 16384; l1++)
            {
                ai[l1] &= 0xf8f8ff;
                int k2 = ai[l1];
                if(k2 == 0)
                    aBooleanArray1475[i] = true;
                ai[16384 + l1] = k2 - (k2 >>> 3) & 0xf8f8ff;
                ai[32768 + l1] = k2 - (k2 >>> 2) & 0xf8f8ff;
                ai[49152 + l1] = k2 - (k2 >>> 2) - (k2 >>> 3) & 0xf8f8ff;
            }

        }
        return ai;
    }

    public static final void method372(double d, byte byte0)
    {
        if(byte0 != 9)
        {
            for(int i = 1; i > 0; i++);
        }
        d += Math.random() * 0.029999999999999999D - 0.014999999999999999D;
        int j = 0;
        for(int k = 0; k < 512; k++)
        {
            double d1 = (double)(k / 8) / 64D + 0.0078125D;
            double d2 = (double)(k & 7) / 8D + 0.0625D;
            for(int k1 = 0; k1 < 128; k1++)
            {
                double d3 = (double)k1 / 128D;
                double d4 = d3;
                double d5 = d3;
                double d6 = d3;
                if(d2 != 0.0D)
                {
                    double d7;
                    if(d3 < 0.5D)
                        d7 = d3 * (1.0D + d2);
                    else
                        d7 = (d3 + d2) - d3 * d2;
                    double d8 = 2D * d3 - d7;
                    double d9 = d1 + 0.33333333333333331D;
                    if(d9 > 1.0D)
                        d9--;
                    double d10 = d1;
                    double d11 = d1 - 0.33333333333333331D;
                    if(d11 < 0.0D)
                        d11++;
                    if(6D * d9 < 1.0D)
                        d4 = d8 + (d7 - d8) * 6D * d9;
                    else
                    if(2D * d9 < 1.0D)
                        d4 = d7;
                    else
                    if(3D * d9 < 2D)
                        d4 = d8 + (d7 - d8) * (0.66666666666666663D - d9) * 6D;
                    else
                        d4 = d8;
                    if(6D * d10 < 1.0D)
                        d5 = d8 + (d7 - d8) * 6D * d10;
                    else
                    if(2D * d10 < 1.0D)
                        d5 = d7;
                    else
                    if(3D * d10 < 2D)
                        d5 = d8 + (d7 - d8) * (0.66666666666666663D - d10) * 6D;
                    else
                        d5 = d8;
                    if(6D * d11 < 1.0D)
                        d6 = d8 + (d7 - d8) * 6D * d11;
                    else
                    if(2D * d11 < 1.0D)
                        d6 = d7;
                    else
                    if(3D * d11 < 2D)
                        d6 = d8 + (d7 - d8) * (0.66666666666666663D - d11) * 6D;
                    else
                        d6 = d8;
                }
                int l1 = (int)(d4 * 256D);
                int i2 = (int)(d5 * 256D);
                int j2 = (int)(d6 * 256D);
                int k2 = (l1 << 16) + (i2 << 8) + j2;
                k2 = method373(k2, d);
                if(k2 == 0)
                    k2 = 1;
                anIntArray1482[j++] = k2;
            }

        }

        for(int l = 0; l < 50; l++)
            if(aClass30_Sub2_Sub1_Sub2Array1474[l] != null)
            {
                int ai[] = aClass30_Sub2_Sub1_Sub2Array1474[l].anIntArray1451;
                anIntArrayArray1483[l] = new int[ai.length];
                for(int j1 = 0; j1 < ai.length; j1++)
                {
                    anIntArrayArray1483[l][j1] = method373(ai[j1], d);
                    if((anIntArrayArray1483[l][j1] & 0xf8f8ff) == 0 && j1 != 0)
                        anIntArrayArray1483[l][j1] = 1;
                }

            }

        for(int i1 = 0; i1 < 50; i1++)
            method370(i1, -477);

    }

    public static int method373(int i, double d)
    {
        double d1 = (double)(i >> 16) / 256D;
        double d2 = (double)(i >> 8 & 0xff) / 256D;
        double d3 = (double)(i & 0xff) / 256D;
        d1 = Math.pow(d1, d);
        d2 = Math.pow(d2, d);
        d3 = Math.pow(d3, d);
        int j = (int)(d1 * 256D);
        int k = (int)(d2 * 256D);
        int l = (int)(d3 * 256D);
        return (j << 16) + (k << 8) + l;
    }

    public static final void method374(int i, int j, int k, int l, int i1, int j1, int k1, int l1,
            int i2)
    {
        int j2 = 0;
        int k2 = 0;
        if(j != i)
        {
            j2 = (i1 - l << 16) / (j - i);
            k2 = (l1 - k1 << 15) / (j - i);
        }
        int l2 = 0;
        int i3 = 0;
        if(k != j)
        {
            l2 = (j1 - i1 << 16) / (k - j);
            i3 = (i2 - l1 << 15) / (k - j);
        }
        int j3 = 0;
        int k3 = 0;
        if(k != i)
        {
            j3 = (l - j1 << 16) / (i - k);
            k3 = (k1 - i2 << 15) / (i - k);
        }
        if(i <= j && i <= k)
        {
            if(i >= Class30_Sub2_Sub1.anInt1382)
                return;
            if(j > Class30_Sub2_Sub1.anInt1382)
                j = Class30_Sub2_Sub1.anInt1382;
            if(k > Class30_Sub2_Sub1.anInt1382)
                k = Class30_Sub2_Sub1.anInt1382;
            if(j < k)
            {
                j1 = l <<= 16;
                i2 = k1 <<= 15;
                if(i < 0)
                {
                    j1 -= j3 * i;
                    l -= j2 * i;
                    i2 -= k3 * i;
                    k1 -= k2 * i;
                    i = 0;
                }
                i1 <<= 16;
                l1 <<= 15;
                if(j < 0)
                {
                    i1 -= l2 * j;
                    l1 -= i3 * j;
                    j = 0;
                }
                if(i != j && j3 < j2 || i == j && j3 > l2)
                {
                    k -= j;
                    j -= i;
                    for(i = anIntArray1472[i]; --j >= 0; i += Class30_Sub2_Sub1.anInt1379)
                    {
                        method375(Class30_Sub2_Sub1.anIntArray1378, i, 0, 0, j1 >> 16, l >> 16, i2 >> 7, k1 >> 7);
                        j1 += j3;
                        l += j2;
                        i2 += k3;
                        k1 += k2;
                    }

                    while(--k >= 0)
                    {
                        method375(Class30_Sub2_Sub1.anIntArray1378, i, 0, 0, j1 >> 16, i1 >> 16, i2 >> 7, l1 >> 7);
                        j1 += j3;
                        i1 += l2;
                        i2 += k3;
                        l1 += i3;
                        i += Class30_Sub2_Sub1.anInt1379;
                    }
                    return;
                }
                k -= j;
                j -= i;
                for(i = anIntArray1472[i]; --j >= 0; i += Class30_Sub2_Sub1.anInt1379)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, i, 0, 0, l >> 16, j1 >> 16, k1 >> 7, i2 >> 7);
                    j1 += j3;
                    l += j2;
                    i2 += k3;
                    k1 += k2;
                }

                while(--k >= 0)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, i, 0, 0, i1 >> 16, j1 >> 16, l1 >> 7, i2 >> 7);
                    j1 += j3;
                    i1 += l2;
                    i2 += k3;
                    l1 += i3;
                    i += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            i1 = l <<= 16;
            l1 = k1 <<= 15;
            if(i < 0)
            {
                i1 -= j3 * i;
                l -= j2 * i;
                l1 -= k3 * i;
                k1 -= k2 * i;
                i = 0;
            }
            j1 <<= 16;
            i2 <<= 15;
            if(k < 0)
            {
                j1 -= l2 * k;
                i2 -= i3 * k;
                k = 0;
            }
            if(i != k && j3 < j2 || i == k && l2 > j2)
            {
                j -= k;
                k -= i;
                for(i = anIntArray1472[i]; --k >= 0; i += Class30_Sub2_Sub1.anInt1379)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, i, 0, 0, i1 >> 16, l >> 16, l1 >> 7, k1 >> 7);
                    i1 += j3;
                    l += j2;
                    l1 += k3;
                    k1 += k2;
                }

                while(--j >= 0)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, i, 0, 0, j1 >> 16, l >> 16, i2 >> 7, k1 >> 7);
                    j1 += l2;
                    l += j2;
                    i2 += i3;
                    k1 += k2;
                    i += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            j -= k;
            k -= i;
            for(i = anIntArray1472[i]; --k >= 0; i += Class30_Sub2_Sub1.anInt1379)
            {
                method375(Class30_Sub2_Sub1.anIntArray1378, i, 0, 0, l >> 16, i1 >> 16, k1 >> 7, l1 >> 7);
                i1 += j3;
                l += j2;
                l1 += k3;
                k1 += k2;
            }

            while(--j >= 0)
            {
                method375(Class30_Sub2_Sub1.anIntArray1378, i, 0, 0, l >> 16, j1 >> 16, k1 >> 7, i2 >> 7);
                j1 += l2;
                l += j2;
                i2 += i3;
                k1 += k2;
                i += Class30_Sub2_Sub1.anInt1379;
            }
            return;
        }
        if(j <= k)
        {
            if(j >= Class30_Sub2_Sub1.anInt1382)
                return;
            if(k > Class30_Sub2_Sub1.anInt1382)
                k = Class30_Sub2_Sub1.anInt1382;
            if(i > Class30_Sub2_Sub1.anInt1382)
                i = Class30_Sub2_Sub1.anInt1382;
            if(k < i)
            {
                l = i1 <<= 16;
                k1 = l1 <<= 15;
                if(j < 0)
                {
                    l -= j2 * j;
                    i1 -= l2 * j;
                    k1 -= k2 * j;
                    l1 -= i3 * j;
                    j = 0;
                }
                j1 <<= 16;
                i2 <<= 15;
                if(k < 0)
                {
                    j1 -= j3 * k;
                    i2 -= k3 * k;
                    k = 0;
                }
                if(j != k && j2 < l2 || j == k && j2 > j3)
                {
                    i -= k;
                    k -= j;
                    for(j = anIntArray1472[j]; --k >= 0; j += Class30_Sub2_Sub1.anInt1379)
                    {
                        method375(Class30_Sub2_Sub1.anIntArray1378, j, 0, 0, l >> 16, i1 >> 16, k1 >> 7, l1 >> 7);
                        l += j2;
                        i1 += l2;
                        k1 += k2;
                        l1 += i3;
                    }

                    while(--i >= 0)
                    {
                        method375(Class30_Sub2_Sub1.anIntArray1378, j, 0, 0, l >> 16, j1 >> 16, k1 >> 7, i2 >> 7);
                        l += j2;
                        j1 += j3;
                        k1 += k2;
                        i2 += k3;
                        j += Class30_Sub2_Sub1.anInt1379;
                    }
                    return;
                }
                i -= k;
                k -= j;
                for(j = anIntArray1472[j]; --k >= 0; j += Class30_Sub2_Sub1.anInt1379)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, j, 0, 0, i1 >> 16, l >> 16, l1 >> 7, k1 >> 7);
                    l += j2;
                    i1 += l2;
                    k1 += k2;
                    l1 += i3;
                }

                while(--i >= 0)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, j, 0, 0, j1 >> 16, l >> 16, i2 >> 7, k1 >> 7);
                    l += j2;
                    j1 += j3;
                    k1 += k2;
                    i2 += k3;
                    j += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            j1 = i1 <<= 16;
            i2 = l1 <<= 15;
            if(j < 0)
            {
                j1 -= j2 * j;
                i1 -= l2 * j;
                i2 -= k2 * j;
                l1 -= i3 * j;
                j = 0;
            }
            l <<= 16;
            k1 <<= 15;
            if(i < 0)
            {
                l -= j3 * i;
                k1 -= k3 * i;
                i = 0;
            }
            if(j2 < l2)
            {
                k -= i;
                i -= j;
                for(j = anIntArray1472[j]; --i >= 0; j += Class30_Sub2_Sub1.anInt1379)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, j, 0, 0, j1 >> 16, i1 >> 16, i2 >> 7, l1 >> 7);
                    j1 += j2;
                    i1 += l2;
                    i2 += k2;
                    l1 += i3;
                }

                while(--k >= 0)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, j, 0, 0, l >> 16, i1 >> 16, k1 >> 7, l1 >> 7);
                    l += j3;
                    i1 += l2;
                    k1 += k3;
                    l1 += i3;
                    j += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            k -= i;
            i -= j;
            for(j = anIntArray1472[j]; --i >= 0; j += Class30_Sub2_Sub1.anInt1379)
            {
                method375(Class30_Sub2_Sub1.anIntArray1378, j, 0, 0, i1 >> 16, j1 >> 16, l1 >> 7, i2 >> 7);
                j1 += j2;
                i1 += l2;
                i2 += k2;
                l1 += i3;
            }

            while(--k >= 0)
            {
                method375(Class30_Sub2_Sub1.anIntArray1378, j, 0, 0, i1 >> 16, l >> 16, l1 >> 7, k1 >> 7);
                l += j3;
                i1 += l2;
                k1 += k3;
                l1 += i3;
                j += Class30_Sub2_Sub1.anInt1379;
            }
            return;
        }
        if(k >= Class30_Sub2_Sub1.anInt1382)
            return;
        if(i > Class30_Sub2_Sub1.anInt1382)
            i = Class30_Sub2_Sub1.anInt1382;
        if(j > Class30_Sub2_Sub1.anInt1382)
            j = Class30_Sub2_Sub1.anInt1382;
        if(i < j)
        {
            i1 = j1 <<= 16;
            l1 = i2 <<= 15;
            if(k < 0)
            {
                i1 -= l2 * k;
                j1 -= j3 * k;
                l1 -= i3 * k;
                i2 -= k3 * k;
                k = 0;
            }
            l <<= 16;
            k1 <<= 15;
            if(i < 0)
            {
                l -= j2 * i;
                k1 -= k2 * i;
                i = 0;
            }
            if(l2 < j3)
            {
                j -= i;
                i -= k;
                for(k = anIntArray1472[k]; --i >= 0; k += Class30_Sub2_Sub1.anInt1379)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, k, 0, 0, i1 >> 16, j1 >> 16, l1 >> 7, i2 >> 7);
                    i1 += l2;
                    j1 += j3;
                    l1 += i3;
                    i2 += k3;
                }

                while(--j >= 0)
                {
                    method375(Class30_Sub2_Sub1.anIntArray1378, k, 0, 0, i1 >> 16, l >> 16, l1 >> 7, k1 >> 7);
                    i1 += l2;
                    l += j2;
                    l1 += i3;
                    k1 += k2;
                    k += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            j -= i;
            i -= k;
            for(k = anIntArray1472[k]; --i >= 0; k += Class30_Sub2_Sub1.anInt1379)
            {
                method375(Class30_Sub2_Sub1.anIntArray1378, k, 0, 0, j1 >> 16, i1 >> 16, i2 >> 7, l1 >> 7);
                i1 += l2;
                j1 += j3;
                l1 += i3;
                i2 += k3;
            }

            while(--j >= 0)
            {
                method375(Class30_Sub2_Sub1.anIntArray1378, k, 0, 0, l >> 16, i1 >> 16, k1 >> 7, l1 >> 7);
                i1 += l2;
                l += j2;
                l1 += i3;
                k1 += k2;
                k += Class30_Sub2_Sub1.anInt1379;
            }
            return;
        }
        l = j1 <<= 16;
        k1 = i2 <<= 15;
        if(k < 0)
        {
            l -= l2 * k;
            j1 -= j3 * k;
            k1 -= i3 * k;
            i2 -= k3 * k;
            k = 0;
        }
        i1 <<= 16;
        l1 <<= 15;
        if(j < 0)
        {
            i1 -= j2 * j;
            l1 -= k2 * j;
            j = 0;
        }
        if(l2 < j3)
        {
            i -= j;
            j -= k;
            for(k = anIntArray1472[k]; --j >= 0; k += Class30_Sub2_Sub1.anInt1379)
            {
                method375(Class30_Sub2_Sub1.anIntArray1378, k, 0, 0, l >> 16, j1 >> 16, k1 >> 7, i2 >> 7);
                l += l2;
                j1 += j3;
                k1 += i3;
                i2 += k3;
            }

            while(--i >= 0)
            {
                method375(Class30_Sub2_Sub1.anIntArray1378, k, 0, 0, i1 >> 16, j1 >> 16, l1 >> 7, i2 >> 7);
                i1 += j2;
                j1 += j3;
                l1 += k2;
                i2 += k3;
                k += Class30_Sub2_Sub1.anInt1379;
            }
            return;
        }
        i -= j;
        j -= k;
        for(k = anIntArray1472[k]; --j >= 0; k += Class30_Sub2_Sub1.anInt1379)
        {
            method375(Class30_Sub2_Sub1.anIntArray1378, k, 0, 0, j1 >> 16, l >> 16, i2 >> 7, k1 >> 7);
            l += l2;
            j1 += j3;
            k1 += i3;
            i2 += k3;
        }

        while(--i >= 0)
        {
            method375(Class30_Sub2_Sub1.anIntArray1378, k, 0, 0, j1 >> 16, i1 >> 16, i2 >> 7, l1 >> 7);
            i1 += j2;
            j1 += j3;
            l1 += k2;
            i2 += k3;
            k += Class30_Sub2_Sub1.anInt1379;
        }
    }

    public static final void method375(int ai[], int i, int j, int k, int l, int i1, int j1, int k1)
    {
        if(aBoolean1464)
        {
            int l1;
            if(aBoolean1462)
            {
                if(i1 - l > 3)
                    l1 = (k1 - j1) / (i1 - l);
                else
                    l1 = 0;
                if(i1 > Class30_Sub2_Sub1.anInt1385)
                    i1 = Class30_Sub2_Sub1.anInt1385;
                if(l < 0)
                {
                    j1 -= l * l1;
                    l = 0;
                }
                if(l >= i1)
                    return;
                i += l;
                k = i1 - l >> 2;
                l1 <<= 2;
            } else
            {
                if(l >= i1)
                    return;
                i += l;
                k = i1 - l >> 2;
                if(k > 0)
                    l1 = (k1 - j1) * anIntArray1468[k] >> 15;
                else
                    l1 = 0;
            }
            if(anInt1465 == 0)
            {
                while(--k >= 0)
                {
                    j = anIntArray1482[j1 >> 8];
                    j1 += l1;
                    ai[i++] = j;
                    ai[i++] = j;
                    ai[i++] = j;
                    ai[i++] = j;
                }
                k = i1 - l & 3;
                if(k > 0)
                {
                    j = anIntArray1482[j1 >> 8];
                    do
                        ai[i++] = j;
                    while(--k > 0);
                    return;
                }
            } else
            {
                int j2 = anInt1465;
                int l2 = 256 - anInt1465;
                while(--k >= 0)
                {
                    j = anIntArray1482[j1 >> 8];
                    j1 += l1;
                    j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
                    ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                    ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                    ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                    ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                }
                k = i1 - l & 3;
                if(k > 0)
                {
                    j = anIntArray1482[j1 >> 8];
                    j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
                    do
                        ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                    while(--k > 0);
                }
            }
            return;
        }
        if(l >= i1)
            return;
        int i2 = (k1 - j1) / (i1 - l);
        if(aBoolean1462)
        {
            if(i1 > Class30_Sub2_Sub1.anInt1385)
                i1 = Class30_Sub2_Sub1.anInt1385;
            if(l < 0)
            {
                j1 -= l * i2;
                l = 0;
            }
            if(l >= i1)
                return;
        }
        i += l;
        k = i1 - l;
        if(anInt1465 == 0)
        {
            do
            {
                ai[i++] = anIntArray1482[j1 >> 8];
                j1 += i2;
            } while(--k > 0);
            return;
        }
        int k2 = anInt1465;
        int i3 = 256 - anInt1465;
        do
        {
            j = anIntArray1482[j1 >> 8];
            j1 += i2;
            j = ((j & 0xff00ff) * i3 >> 8 & 0xff00ff) + ((j & 0xff00) * i3 >> 8 & 0xff00);
            ai[i++] = j + ((ai[i] & 0xff00ff) * k2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * k2 >> 8 & 0xff00);
        } while(--k > 0);
    }

    public static final void method376(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        int l1 = 0;
        if(j != i)
            l1 = (i1 - l << 16) / (j - i);
        int i2 = 0;
        if(k != j)
            i2 = (j1 - i1 << 16) / (k - j);
        int j2 = 0;
        if(k != i)
            j2 = (l - j1 << 16) / (i - k);
        if(i <= j && i <= k)
        {
            if(i >= Class30_Sub2_Sub1.anInt1382)
                return;
            if(j > Class30_Sub2_Sub1.anInt1382)
                j = Class30_Sub2_Sub1.anInt1382;
            if(k > Class30_Sub2_Sub1.anInt1382)
                k = Class30_Sub2_Sub1.anInt1382;
            if(j < k)
            {
                j1 = l <<= 16;
                if(i < 0)
                {
                    j1 -= j2 * i;
                    l -= l1 * i;
                    i = 0;
                }
                i1 <<= 16;
                if(j < 0)
                {
                    i1 -= i2 * j;
                    j = 0;
                }
                if(i != j && j2 < l1 || i == j && j2 > i2)
                {
                    k -= j;
                    j -= i;
                    for(i = anIntArray1472[i]; --j >= 0; i += Class30_Sub2_Sub1.anInt1379)
                    {
                        method377(Class30_Sub2_Sub1.anIntArray1378, i, k1, 0, j1 >> 16, l >> 16);
                        j1 += j2;
                        l += l1;
                    }

                    while(--k >= 0)
                    {
                        method377(Class30_Sub2_Sub1.anIntArray1378, i, k1, 0, j1 >> 16, i1 >> 16);
                        j1 += j2;
                        i1 += i2;
                        i += Class30_Sub2_Sub1.anInt1379;
                    }
                    return;
                }
                k -= j;
                j -= i;
                for(i = anIntArray1472[i]; --j >= 0; i += Class30_Sub2_Sub1.anInt1379)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, i, k1, 0, l >> 16, j1 >> 16);
                    j1 += j2;
                    l += l1;
                }

                while(--k >= 0)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, i, k1, 0, i1 >> 16, j1 >> 16);
                    j1 += j2;
                    i1 += i2;
                    i += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            i1 = l <<= 16;
            if(i < 0)
            {
                i1 -= j2 * i;
                l -= l1 * i;
                i = 0;
            }
            j1 <<= 16;
            if(k < 0)
            {
                j1 -= i2 * k;
                k = 0;
            }
            if(i != k && j2 < l1 || i == k && i2 > l1)
            {
                j -= k;
                k -= i;
                for(i = anIntArray1472[i]; --k >= 0; i += Class30_Sub2_Sub1.anInt1379)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, i, k1, 0, i1 >> 16, l >> 16);
                    i1 += j2;
                    l += l1;
                }

                while(--j >= 0)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, i, k1, 0, j1 >> 16, l >> 16);
                    j1 += i2;
                    l += l1;
                    i += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            j -= k;
            k -= i;
            for(i = anIntArray1472[i]; --k >= 0; i += Class30_Sub2_Sub1.anInt1379)
            {
                method377(Class30_Sub2_Sub1.anIntArray1378, i, k1, 0, l >> 16, i1 >> 16);
                i1 += j2;
                l += l1;
            }

            while(--j >= 0)
            {
                method377(Class30_Sub2_Sub1.anIntArray1378, i, k1, 0, l >> 16, j1 >> 16);
                j1 += i2;
                l += l1;
                i += Class30_Sub2_Sub1.anInt1379;
            }
            return;
        }
        if(j <= k)
        {
            if(j >= Class30_Sub2_Sub1.anInt1382)
                return;
            if(k > Class30_Sub2_Sub1.anInt1382)
                k = Class30_Sub2_Sub1.anInt1382;
            if(i > Class30_Sub2_Sub1.anInt1382)
                i = Class30_Sub2_Sub1.anInt1382;
            if(k < i)
            {
                l = i1 <<= 16;
                if(j < 0)
                {
                    l -= l1 * j;
                    i1 -= i2 * j;
                    j = 0;
                }
                j1 <<= 16;
                if(k < 0)
                {
                    j1 -= j2 * k;
                    k = 0;
                }
                if(j != k && l1 < i2 || j == k && l1 > j2)
                {
                    i -= k;
                    k -= j;
                    for(j = anIntArray1472[j]; --k >= 0; j += Class30_Sub2_Sub1.anInt1379)
                    {
                        method377(Class30_Sub2_Sub1.anIntArray1378, j, k1, 0, l >> 16, i1 >> 16);
                        l += l1;
                        i1 += i2;
                    }

                    while(--i >= 0)
                    {
                        method377(Class30_Sub2_Sub1.anIntArray1378, j, k1, 0, l >> 16, j1 >> 16);
                        l += l1;
                        j1 += j2;
                        j += Class30_Sub2_Sub1.anInt1379;
                    }
                    return;
                }
                i -= k;
                k -= j;
                for(j = anIntArray1472[j]; --k >= 0; j += Class30_Sub2_Sub1.anInt1379)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, j, k1, 0, i1 >> 16, l >> 16);
                    l += l1;
                    i1 += i2;
                }

                while(--i >= 0)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, j, k1, 0, j1 >> 16, l >> 16);
                    l += l1;
                    j1 += j2;
                    j += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            j1 = i1 <<= 16;
            if(j < 0)
            {
                j1 -= l1 * j;
                i1 -= i2 * j;
                j = 0;
            }
            l <<= 16;
            if(i < 0)
            {
                l -= j2 * i;
                i = 0;
            }
            if(l1 < i2)
            {
                k -= i;
                i -= j;
                for(j = anIntArray1472[j]; --i >= 0; j += Class30_Sub2_Sub1.anInt1379)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, j, k1, 0, j1 >> 16, i1 >> 16);
                    j1 += l1;
                    i1 += i2;
                }

                while(--k >= 0)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, j, k1, 0, l >> 16, i1 >> 16);
                    l += j2;
                    i1 += i2;
                    j += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            k -= i;
            i -= j;
            for(j = anIntArray1472[j]; --i >= 0; j += Class30_Sub2_Sub1.anInt1379)
            {
                method377(Class30_Sub2_Sub1.anIntArray1378, j, k1, 0, i1 >> 16, j1 >> 16);
                j1 += l1;
                i1 += i2;
            }

            while(--k >= 0)
            {
                method377(Class30_Sub2_Sub1.anIntArray1378, j, k1, 0, i1 >> 16, l >> 16);
                l += j2;
                i1 += i2;
                j += Class30_Sub2_Sub1.anInt1379;
            }
            return;
        }
        if(k >= Class30_Sub2_Sub1.anInt1382)
            return;
        if(i > Class30_Sub2_Sub1.anInt1382)
            i = Class30_Sub2_Sub1.anInt1382;
        if(j > Class30_Sub2_Sub1.anInt1382)
            j = Class30_Sub2_Sub1.anInt1382;
        if(i < j)
        {
            i1 = j1 <<= 16;
            if(k < 0)
            {
                i1 -= i2 * k;
                j1 -= j2 * k;
                k = 0;
            }
            l <<= 16;
            if(i < 0)
            {
                l -= l1 * i;
                i = 0;
            }
            if(i2 < j2)
            {
                j -= i;
                i -= k;
                for(k = anIntArray1472[k]; --i >= 0; k += Class30_Sub2_Sub1.anInt1379)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, k, k1, 0, i1 >> 16, j1 >> 16);
                    i1 += i2;
                    j1 += j2;
                }

                while(--j >= 0)
                {
                    method377(Class30_Sub2_Sub1.anIntArray1378, k, k1, 0, i1 >> 16, l >> 16);
                    i1 += i2;
                    l += l1;
                    k += Class30_Sub2_Sub1.anInt1379;
                }
                return;
            }
            j -= i;
            i -= k;
            for(k = anIntArray1472[k]; --i >= 0; k += Class30_Sub2_Sub1.anInt1379)
            {
                method377(Class30_Sub2_Sub1.anIntArray1378, k, k1, 0, j1 >> 16, i1 >> 16);
                i1 += i2;
                j1 += j2;
            }

            while(--j >= 0)
            {
                method377(Class30_Sub2_Sub1.anIntArray1378, k, k1, 0, l >> 16, i1 >> 16);
                i1 += i2;
                l += l1;
                k += Class30_Sub2_Sub1.anInt1379;
            }
            return;
        }
        l = j1 <<= 16;
        if(k < 0)
        {
            l -= i2 * k;
            j1 -= j2 * k;
            k = 0;
        }
        i1 <<= 16;
        if(j < 0)
        {
            i1 -= l1 * j;
            j = 0;
        }
        if(i2 < j2)
        {
            i -= j;
            j -= k;
            for(k = anIntArray1472[k]; --j >= 0; k += Class30_Sub2_Sub1.anInt1379)
            {
                method377(Class30_Sub2_Sub1.anIntArray1378, k, k1, 0, l >> 16, j1 >> 16);
                l += i2;
                j1 += j2;
            }

            while(--i >= 0)
            {
                method377(Class30_Sub2_Sub1.anIntArray1378, k, k1, 0, i1 >> 16, j1 >> 16);
                i1 += l1;
                j1 += j2;
                k += Class30_Sub2_Sub1.anInt1379;
            }
            return;
        }
        i -= j;
        j -= k;
        for(k = anIntArray1472[k]; --j >= 0; k += Class30_Sub2_Sub1.anInt1379)
        {
            method377(Class30_Sub2_Sub1.anIntArray1378, k, k1, 0, j1 >> 16, l >> 16);
            l += i2;
            j1 += j2;
        }

        while(--i >= 0)
        {
            method377(Class30_Sub2_Sub1.anIntArray1378, k, k1, 0, j1 >> 16, i1 >> 16);
            i1 += l1;
            j1 += j2;
            k += Class30_Sub2_Sub1.anInt1379;
        }
    }

    public static final void method377(int ai[], int i, int j, int k, int l, int i1)
    {
        if(aBoolean1462)
        {
            if(i1 > Class30_Sub2_Sub1.anInt1385)
                i1 = Class30_Sub2_Sub1.anInt1385;
            if(l < 0)
                l = 0;
        }
        if(l >= i1)
            return;
        i += l;
        k = i1 - l >> 2;
        if(anInt1465 == 0)
        {
            while(--k >= 0)
            {
                ai[i++] = j;
                ai[i++] = j;
                ai[i++] = j;
                ai[i++] = j;
            }
            for(k = i1 - l & 3; --k >= 0;)
                ai[i++] = j;

            return;
        }
        int j1 = anInt1465;
        int k1 = 256 - anInt1465;
        j = ((j & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((j & 0xff00) * k1 >> 8 & 0xff00);
        while(--k >= 0)
        {
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
        }
        for(k = i1 - l & 3; --k >= 0;)
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);

    }

    public static final void method378(int i, int j, int k, int l, int i1, int j1, int k1, int l1,
            int i2, int j2, int k2, int l2, int i3, int j3, int k3,
            int l3, int i4, int j4, int k4)
    {
        int ai[] = method371(k4);
        aBoolean1463 = !aBooleanArray1475[k4];
        k2 = j2 - k2;
        j3 = i3 - j3;
        i4 = l3 - i4;
        l2 -= j2;
        k3 -= i3;
        j4 -= l3;
        int l4 = l2 * i3 - k3 * j2 << 14;
        int i5 = k3 * l3 - j4 * i3 << 8;
        int j5 = j4 * j2 - l2 * l3 << 5;
        int k5 = k2 * i3 - j3 * j2 << 14;
        int l5 = j3 * l3 - i4 * i3 << 8;
        int i6 = i4 * j2 - k2 * l3 << 5;
        int j6 = j3 * l2 - k2 * k3 << 14;
        int k6 = i4 * k3 - j3 * j4 << 8;
        int l6 = k2 * j4 - i4 * l2 << 5;
        int i7 = 0;
        int j7 = 0;
        if(j != i)
        {
            i7 = (i1 - l << 16) / (j - i);
            j7 = (l1 - k1 << 16) / (j - i);
        }
        int k7 = 0;
        int l7 = 0;
        if(k != j)
        {
            k7 = (j1 - i1 << 16) / (k - j);
            l7 = (i2 - l1 << 16) / (k - j);
        }
        int i8 = 0;
        int j8 = 0;
        if(k != i)
        {
            i8 = (l - j1 << 16) / (i - k);
            j8 = (k1 - i2 << 16) / (i - k);
        }
        if(i <= j && i <= k)
        {
            if(i >= Class30_Sub2_Sub1.anInt1382)
                return;
            if(j > Class30_Sub2_Sub1.anInt1382)
                j = Class30_Sub2_Sub1.anInt1382;
            if(k > Class30_Sub2_Sub1.anInt1382)
                k = Class30_Sub2_Sub1.anInt1382;
            if(j < k)
            {
                j1 = l <<= 16;
                i2 = k1 <<= 16;
                if(i < 0)
                {
                    j1 -= i8 * i;
                    l -= i7 * i;
                    i2 -= j8 * i;
                    k1 -= j7 * i;
                    i = 0;
                }
                i1 <<= 16;
                l1 <<= 16;
                if(j < 0)
                {
                    i1 -= k7 * j;
                    l1 -= l7 * j;
                    j = 0;
                }
                int k8 = i - anInt1467;
                l4 += j5 * k8;
                k5 += i6 * k8;
                j6 += l6 * k8;
                if(i != j && i8 < i7 || i == j && i8 > k7)
                {
                    k -= j;
                    j -= i;
                    i = anIntArray1472[i];
                    while(--j >= 0)
                    {
                        method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, i, j1 >> 16, l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                        j1 += i8;
                        l += i7;
                        i2 += j8;
                        k1 += j7;
                        i += Class30_Sub2_Sub1.anInt1379;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    while(--k >= 0)
                    {
                        method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, i, j1 >> 16, i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                        j1 += i8;
                        i1 += k7;
                        i2 += j8;
                        l1 += l7;
                        i += Class30_Sub2_Sub1.anInt1379;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    return;
                }
                k -= j;
                j -= i;
                i = anIntArray1472[i];
                while(--j >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, i, l >> 16, j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                    j1 += i8;
                    l += i7;
                    i2 += j8;
                    k1 += j7;
                    i += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while(--k >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, i, i1 >> 16, j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                    j1 += i8;
                    i1 += k7;
                    i2 += j8;
                    l1 += l7;
                    i += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            i1 = l <<= 16;
            l1 = k1 <<= 16;
            if(i < 0)
            {
                i1 -= i8 * i;
                l -= i7 * i;
                l1 -= j8 * i;
                k1 -= j7 * i;
                i = 0;
            }
            j1 <<= 16;
            i2 <<= 16;
            if(k < 0)
            {
                j1 -= k7 * k;
                i2 -= l7 * k;
                k = 0;
            }
            int l8 = i - anInt1467;
            l4 += j5 * l8;
            k5 += i6 * l8;
            j6 += l6 * l8;
            if(i != k && i8 < i7 || i == k && k7 > i7)
            {
                j -= k;
                k -= i;
                i = anIntArray1472[i];
                while(--k >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, i, i1 >> 16, l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    i1 += i8;
                    l += i7;
                    l1 += j8;
                    k1 += j7;
                    i += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while(--j >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, i, j1 >> 16, l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    j1 += k7;
                    l += i7;
                    i2 += l7;
                    k1 += j7;
                    i += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            j -= k;
            k -= i;
            i = anIntArray1472[i];
            while(--k >= 0)
            {
                method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, i, l >> 16, i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                i1 += i8;
                l += i7;
                l1 += j8;
                k1 += j7;
                i += Class30_Sub2_Sub1.anInt1379;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            while(--j >= 0)
            {
                method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, i, l >> 16, j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                j1 += k7;
                l += i7;
                i2 += l7;
                k1 += j7;
                i += Class30_Sub2_Sub1.anInt1379;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            return;
        }
        if(j <= k)
        {
            if(j >= Class30_Sub2_Sub1.anInt1382)
                return;
            if(k > Class30_Sub2_Sub1.anInt1382)
                k = Class30_Sub2_Sub1.anInt1382;
            if(i > Class30_Sub2_Sub1.anInt1382)
                i = Class30_Sub2_Sub1.anInt1382;
            if(k < i)
            {
                l = i1 <<= 16;
                k1 = l1 <<= 16;
                if(j < 0)
                {
                    l -= i7 * j;
                    i1 -= k7 * j;
                    k1 -= j7 * j;
                    l1 -= l7 * j;
                    j = 0;
                }
                j1 <<= 16;
                i2 <<= 16;
                if(k < 0)
                {
                    j1 -= i8 * k;
                    i2 -= j8 * k;
                    k = 0;
                }
                int i9 = j - anInt1467;
                l4 += j5 * i9;
                k5 += i6 * i9;
                j6 += l6 * i9;
                if(j != k && i7 < k7 || j == k && i7 > i8)
                {
                    i -= k;
                    k -= j;
                    j = anIntArray1472[j];
                    while(--k >= 0)
                    {
                        method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, j, l >> 16, i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                        l += i7;
                        i1 += k7;
                        k1 += j7;
                        l1 += l7;
                        j += Class30_Sub2_Sub1.anInt1379;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    while(--i >= 0)
                    {
                        method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, j, l >> 16, j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                        l += i7;
                        j1 += i8;
                        k1 += j7;
                        i2 += j8;
                        j += Class30_Sub2_Sub1.anInt1379;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    return;
                }
                i -= k;
                k -= j;
                j = anIntArray1472[j];
                while(--k >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, j, i1 >> 16, l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    l += i7;
                    i1 += k7;
                    k1 += j7;
                    l1 += l7;
                    j += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while(--i >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, j, j1 >> 16, l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    l += i7;
                    j1 += i8;
                    k1 += j7;
                    i2 += j8;
                    j += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            j1 = i1 <<= 16;
            i2 = l1 <<= 16;
            if(j < 0)
            {
                j1 -= i7 * j;
                i1 -= k7 * j;
                i2 -= j7 * j;
                l1 -= l7 * j;
                j = 0;
            }
            l <<= 16;
            k1 <<= 16;
            if(i < 0)
            {
                l -= i8 * i;
                k1 -= j8 * i;
                i = 0;
            }
            int j9 = j - anInt1467;
            l4 += j5 * j9;
            k5 += i6 * j9;
            j6 += l6 * j9;
            if(i7 < k7)
            {
                k -= i;
                i -= j;
                j = anIntArray1472[j];
                while(--i >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, j, j1 >> 16, i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                    j1 += i7;
                    i1 += k7;
                    i2 += j7;
                    l1 += l7;
                    j += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while(--k >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, j, l >> 16, i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                    l += i8;
                    i1 += k7;
                    k1 += j8;
                    l1 += l7;
                    j += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            k -= i;
            i -= j;
            j = anIntArray1472[j];
            while(--i >= 0)
            {
                method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, j, i1 >> 16, j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                j1 += i7;
                i1 += k7;
                i2 += j7;
                l1 += l7;
                j += Class30_Sub2_Sub1.anInt1379;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            while(--k >= 0)
            {
                method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, j, i1 >> 16, l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                l += i8;
                i1 += k7;
                k1 += j8;
                l1 += l7;
                j += Class30_Sub2_Sub1.anInt1379;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            return;
        }
        if(k >= Class30_Sub2_Sub1.anInt1382)
            return;
        if(i > Class30_Sub2_Sub1.anInt1382)
            i = Class30_Sub2_Sub1.anInt1382;
        if(j > Class30_Sub2_Sub1.anInt1382)
            j = Class30_Sub2_Sub1.anInt1382;
        if(i < j)
        {
            i1 = j1 <<= 16;
            l1 = i2 <<= 16;
            if(k < 0)
            {
                i1 -= k7 * k;
                j1 -= i8 * k;
                l1 -= l7 * k;
                i2 -= j8 * k;
                k = 0;
            }
            l <<= 16;
            k1 <<= 16;
            if(i < 0)
            {
                l -= i7 * i;
                k1 -= j7 * i;
                i = 0;
            }
            int k9 = k - anInt1467;
            l4 += j5 * k9;
            k5 += i6 * k9;
            j6 += l6 * k9;
            if(k7 < i8)
            {
                j -= i;
                i -= k;
                k = anIntArray1472[k];
                while(--i >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, k, i1 >> 16, j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                    i1 += k7;
                    j1 += i8;
                    l1 += l7;
                    i2 += j8;
                    k += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while(--j >= 0)
                {
                    method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, k, i1 >> 16, l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    i1 += k7;
                    l += i7;
                    l1 += l7;
                    k1 += j7;
                    k += Class30_Sub2_Sub1.anInt1379;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            j -= i;
            i -= k;
            k = anIntArray1472[k];
            while(--i >= 0)
            {
                method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, k, j1 >> 16, i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                i1 += k7;
                j1 += i8;
                l1 += l7;
                i2 += j8;
                k += Class30_Sub2_Sub1.anInt1379;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            while(--j >= 0)
            {
                method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, k, l >> 16, i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                i1 += k7;
                l += i7;
                l1 += l7;
                k1 += j7;
                k += Class30_Sub2_Sub1.anInt1379;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            return;
        }
        l = j1 <<= 16;
        k1 = i2 <<= 16;
        if(k < 0)
        {
            l -= k7 * k;
            j1 -= i8 * k;
            k1 -= l7 * k;
            i2 -= j8 * k;
            k = 0;
        }
        i1 <<= 16;
        l1 <<= 16;
        if(j < 0)
        {
            i1 -= i7 * j;
            l1 -= j7 * j;
            j = 0;
        }
        int l9 = k - anInt1467;
        l4 += j5 * l9;
        k5 += i6 * l9;
        j6 += l6 * l9;
        if(k7 < i8)
        {
            i -= j;
            j -= k;
            k = anIntArray1472[k];
            while(--j >= 0)
            {
                method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, k, l >> 16, j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                l += k7;
                j1 += i8;
                k1 += l7;
                i2 += j8;
                k += Class30_Sub2_Sub1.anInt1379;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            while(--i >= 0)
            {
                method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, k, i1 >> 16, j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                i1 += i7;
                j1 += i8;
                l1 += j7;
                i2 += j8;
                k += Class30_Sub2_Sub1.anInt1379;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            return;
        }
        i -= j;
        j -= k;
        k = anIntArray1472[k];
        while(--j >= 0)
        {
            method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, k, j1 >> 16, l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
            l += k7;
            j1 += i8;
            k1 += l7;
            i2 += j8;
            k += Class30_Sub2_Sub1.anInt1379;
            l4 += j5;
            k5 += i6;
            j6 += l6;
        }
        while(--i >= 0)
        {
            method379(Class30_Sub2_Sub1.anIntArray1378, ai, 0, 0, k, j1 >> 16, i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
            i1 += i7;
            j1 += i8;
            l1 += j7;
            i2 += j8;
            k += Class30_Sub2_Sub1.anInt1379;
            l4 += j5;
            k5 += i6;
            j6 += l6;
        }
    }

    public static final void method379(int ai[], int ai1[], int i, int j, int k, int l, int i1, int j1,
            int k1, int l1, int i2, int j2, int k2, int l2, int i3)
    {
        if(l >= i1)
            return;
        int j3;
        int k3;
        if(aBoolean1462)
        {
            j3 = (k1 - j1) / (i1 - l);
            if(i1 > Class30_Sub2_Sub1.anInt1385)
                i1 = Class30_Sub2_Sub1.anInt1385;
            if(l < 0)
            {
                j1 -= l * j3;
                l = 0;
            }
            if(l >= i1)
                return;
            k3 = i1 - l >> 3;
            j3 <<= 12;
            j1 <<= 9;
        } else
        {
            if(i1 - l > 7)
            {
                k3 = i1 - l >> 3;
                j3 = (k1 - j1) * anIntArray1468[k3] >> 6;
            } else
            {
                k3 = 0;
                j3 = 0;
            }
            j1 <<= 9;
        }
        k += l;
        if(aBoolean1461)
        {
            int i4 = 0;
            int k4 = 0;
            int k6 = l - anInt1466;
            l1 += (k2 >> 3) * k6;
            i2 += (l2 >> 3) * k6;
            j2 += (i3 >> 3) * k6;
            int i5 = j2 >> 12;
            if(i5 != 0)
            {
                i = l1 / i5;
                j = i2 / i5;
                if(i < 0)
                    i = 0;
                else
                if(i > 4032)
                    i = 4032;
            }
            l1 += k2;
            i2 += l2;
            j2 += i3;
            i5 = j2 >> 12;
            if(i5 != 0)
            {
                i4 = l1 / i5;
                k4 = i2 / i5;
                if(i4 < 7)
                    i4 = 7;
                else
                if(i4 > 4032)
                    i4 = 4032;
            }
            int i7 = i4 - i >> 3;
            int k7 = k4 - j >> 3;
            i += (j1 & 0x600000) >> 3;
            int i8 = j1 >> 23;
            if(aBoolean1463)
            {
                while(k3-- > 0)
                {
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i = i4;
                    j = k4;
                    l1 += k2;
                    i2 += l2;
                    j2 += i3;
                    int j5 = j2 >> 12;
                    if(j5 != 0)
                    {
                        i4 = l1 / j5;
                        k4 = i2 / j5;
                        if(i4 < 7)
                            i4 = 7;
                        else
                        if(i4 > 4032)
                            i4 = 4032;
                    }
                    i7 = i4 - i >> 3;
                    k7 = k4 - j >> 3;
                    j1 += j3;
                    i += (j1 & 0x600000) >> 3;
                    i8 = j1 >> 23;
                }
                for(k3 = i1 - l & 7; k3-- > 0;)
                {
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                }

                return;
            }
            while(k3-- > 0)
            {
                int k8;
                if((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i = i4;
                j = k4;
                l1 += k2;
                i2 += l2;
                j2 += i3;
                int k5 = j2 >> 12;
                if(k5 != 0)
                {
                    i4 = l1 / k5;
                    k4 = i2 / k5;
                    if(i4 < 7)
                        i4 = 7;
                    else
                    if(i4 > 4032)
                        i4 = 4032;
                }
                i7 = i4 - i >> 3;
                k7 = k4 - j >> 3;
                j1 += j3;
                i += (j1 & 0x600000) >> 3;
                i8 = j1 >> 23;
            }
            for(k3 = i1 - l & 7; k3-- > 0;)
            {
                int l8;
                if((l8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = l8;
                k++;
                i += i7;
                j += k7;
            }

            return;
        }
        int j4 = 0;
        int l4 = 0;
        int l6 = l - anInt1466;
        l1 += (k2 >> 3) * l6;
        i2 += (l2 >> 3) * l6;
        j2 += (i3 >> 3) * l6;
        int l5 = j2 >> 14;
        if(l5 != 0)
        {
            i = l1 / l5;
            j = i2 / l5;
            if(i < 0)
                i = 0;
            else
            if(i > 16256)
                i = 16256;
        }
        l1 += k2;
        i2 += l2;
        j2 += i3;
        l5 = j2 >> 14;
        if(l5 != 0)
        {
            j4 = l1 / l5;
            l4 = i2 / l5;
            if(j4 < 7)
                j4 = 7;
            else
            if(j4 > 16256)
                j4 = 16256;
        }
        int j7 = j4 - i >> 3;
        int l7 = l4 - j >> 3;
        i += j1 & 0x600000;
        int j8 = j1 >> 23;
        if(aBoolean1463)
        {
            while(k3-- > 0)
            {
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i = j4;
                j = l4;
                l1 += k2;
                i2 += l2;
                j2 += i3;
                int i6 = j2 >> 14;
                if(i6 != 0)
                {
                    j4 = l1 / i6;
                    l4 = i2 / i6;
                    if(j4 < 7)
                        j4 = 7;
                    else
                    if(j4 > 16256)
                        j4 = 16256;
                }
                j7 = j4 - i >> 3;
                l7 = l4 - j >> 3;
                j1 += j3;
                i += j1 & 0x600000;
                j8 = j1 >> 23;
            }
            for(k3 = i1 - l & 7; k3-- > 0;)
            {
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
            }

            return;
        }
        while(k3-- > 0)
        {
            int i9;
            if((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i = j4;
            j = l4;
            l1 += k2;
            i2 += l2;
            j2 += i3;
            int j6 = j2 >> 14;
            if(j6 != 0)
            {
                j4 = l1 / j6;
                l4 = i2 / j6;
                if(j4 < 7)
                    j4 = 7;
                else
                if(j4 > 16256)
                    j4 = 16256;
            }
            j7 = j4 - i >> 3;
            l7 = l4 - j >> 3;
            j1 += j3;
            i += j1 & 0x600000;
            j8 = j1 >> 23;
        }
        for(int l3 = i1 - l & 7; l3-- > 0;)
        {
            int j9;
            if((j9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = j9;
            k++;
            i += j7;
            j += l7;
        }

    }

    private static int anInt1458 = -436;
    private static int anInt1459 = -477;
    private static boolean aBoolean1460 = true;
    public static boolean aBoolean1461 = true;
    static boolean aBoolean1462;
    static boolean aBoolean1463;
    public static boolean aBoolean1464 = true;
    public static int anInt1465;
    public static int anInt1466;
    public static int anInt1467;
    public static int anIntArray1468[];
    public static int anIntArray1469[];
    public static int anIntArray1470[];
    public static int anIntArray1471[];
    public static int anIntArray1472[];
    static int anInt1473;
    public static Class30_Sub2_Sub1_Sub2 aClass30_Sub2_Sub1_Sub2Array1474[] = new Class30_Sub2_Sub1_Sub2[50];
    static boolean aBooleanArray1475[] = new boolean[50];
    static int anIntArray1476[] = new int[50];
    static int anInt1477;
    static int anIntArrayArray1478[][];
    static int anIntArrayArray1479[][] = new int[50][];
    public static int anIntArray1480[] = new int[50];
    public static int anInt1481;
    public static int anIntArray1482[] = new int[0x10000];
    static int anIntArrayArray1483[][] = new int[50][];

    static
    {
        anIntArray1468 = new int[512];
        anIntArray1469 = new int[2048];
        anIntArray1470 = new int[2048];
        anIntArray1471 = new int[2048];
        for(int i = 1; i < 512; i++)
            anIntArray1468[i] = 32768 / i;

        for(int j = 1; j < 2048; j++)
            anIntArray1469[j] = 0x10000 / j;

        for(int k = 0; k < 2048; k++)
        {
            anIntArray1470[k] = (int)(65536D * Math.sin((double)k * 0.0030679614999999999D));
            anIntArray1471[k] = (int)(65536D * Math.cos((double)k * 0.0030679614999999999D));
        }

    }
}

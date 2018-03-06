package cn.nukkit.server.level.particle;

import cn.nukkit.server.math.Vector3;

/**
 * Created on 2015/11/21 by xtypr.
 * Package cn.nukkit.server.level.particle in project Nukkit .
 */
public class EnchantParticle extends GenericParticle {
    public EnchantParticle(Vector3 pos) {
        super(pos, Particle.TYPE_MOB_SPELL);
    }
}
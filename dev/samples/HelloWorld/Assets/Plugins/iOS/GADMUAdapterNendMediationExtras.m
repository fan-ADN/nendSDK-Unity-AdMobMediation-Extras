//
//  GADMUAdapterNendMediationExtras.m
//
//
// Copyright © 2017年 FAN Communications, Inc. All rights reserved.
//

#import "GADMUAdapterNendMediationExtras.h"
#import <NendAdapter/NendAdapter.h>

@implementation GADMUAdapterNendMediationExtras

- (id<GADAdNetworkExtras>)adNetworkExtrasWithDictionary:(NSDictionary<NSString *, NSString *> *)extras {

    NSString *type = extras[@"type"];
    if (type.length == 0) {
        return nil;
    }

    GADMAdapterNendExtras *nendExtras = [[GADMAdapterNendExtras alloc] init];

    if ([type isEqualToString:@"interstitialTypeVideo"]) {
        nendExtras.interstitialType = GADMAdapterNendInterstitialTypeVideo;

        NSString *userId = extras[@"userId"];
        if (userId.length != 0) {
            nendExtras.userId = userId;
        }

    } else {
        nendExtras.interstitialType = GADMAdapterNendInterstitialTypeNormal;
    }

    return nendExtras;
}
@end

//
//  GADMUAdapterNendMediationExtras.m
//  
//  Created by F@N on 2017/10/02.
//

#import "GADMUAdapterNendMediationExtras.h"
#import <NendAdapter/NendAdapter.h>

@implementation GADMUAdapterNendMediationExtras

- (id<GADAdNetworkExtras>)adNetworkExtrasWithDictionary:(NSDictionary<NSString *, NSString *> *)extras {
    
    GADMAdapterNendExtras *nendExtras = [[GADMAdapterNendExtras alloc] init];
    NSString *value = extras[@"GADMNendInterstitialType"];
    
    if ([value isEqualToString:@"interstitialTypeVideo"]) {
        nendExtras.interstitialType = GADMNendInterstitialTypeVideo;
        
        NSString *userId = extras[@"userId"];
        if (userId.length > 0) {
            nendExtras.userId = userId;
        }
    } else {
        nendExtras.interstitialType = GADMNendInterstitialTypeNormal;
    }
    
    return nendExtras;
}
@end
